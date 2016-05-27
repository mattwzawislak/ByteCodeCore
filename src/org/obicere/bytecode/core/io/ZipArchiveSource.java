package org.obicere.bytecode.core.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author Obicere
 */
public class ZipArchiveSource implements BranchSource {

    private final Collection<Long> tasks = Collections.synchronizedCollection(new ArrayList<>());

    private final ReentrantLock lock = new ReentrantLock();

    private volatile boolean closed = true;

    private volatile ZipFile openedFile;

    private final String file;

    private final ZipSystem system;

    public ZipArchiveSource(final String file) {
        this(ZipSystem.getSystemZipSystem(), file);
    }

    public ZipArchiveSource(final File file) {
        this(ZipSystem.getSystemZipSystem(), file);
    }

    public ZipArchiveSource(final ZipSystem system, final String file) {
        if (file == null || file.length() == 0) {
            throw new IllegalArgumentException("file must be non-empty.");
        }
        this.file = file;
        if (system == null) {
            this.system = ZipSystem.getSystemZipSystem();
        } else {
            this.system = system;
        }
        ensureZip();
    }

    public ZipArchiveSource(final ZipSystem system, final File file) {
        if (file == null) {
            throw new NullPointerException("file must be non-null.");
        }
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException("file must be an existing file.");
        }
        this.file = file.getAbsolutePath();
        if (system == null) {
            this.system = ZipSystem.getSystemZipSystem();
        } else {
            this.system = system;
        }
        ensureZip();
    }

    private void ensureZip() {
        if (!file.endsWith(".zip") && !file.endsWith(".jar")) {
            throw new IllegalArgumentException("specified file is not a supported archive.");
        }
    }

    public boolean isComplete() {
        return tasks.isEmpty();
    }

    public boolean isClosed() {
        return closed;
    }

    public InputStream getInputStream(final String name) throws IOException {
        final ZipFile file = getZipFile();
        final ZipEntry entry = file.getEntry(name);
        final InputStream stream = file.getInputStream(entry);
        final long task = entry.getCrc();

        tasks.add(task);

        return new TaskedZipFileInputStream(stream, task);
    }

    public ZipEntry getEntry(final String name) throws IOException {
        final ZipFile file = getZipFile();
        return file.getEntry(name);
    }

    @Override
    public Source[] getChildren(final boolean recursive) {
        // TODO make the zip file actually listen to recursive parameter
        try {
            final ZipFile file = getZipFile();
            final Enumeration<? extends ZipEntry> entries = file.entries();

            final List<Source> sources = new LinkedList<>();

            while (entries.hasMoreElements()) {
                final ZipEntry entry = entries.nextElement();

                sources.add(new ZipEntrySource(system, this.file, entry.getName()));
            }
            return sources.toArray(new Source[sources.size()]);
        } catch (final IOException e) {
            e.printStackTrace();
            return new Source[0];
        }
    }

    @Override
    public Source getChild(final String name) {
        return new ZipEntrySource(system, file, name);
    }

    @Override
    public boolean exists() {
        final File zip = new File(file);
        return zip.exists() && zip.isFile();
    }

    @Override
    public String getPath() {
        return file;
    }

    private ZipFile getZipFile() throws IOException {
        try {
            lock.lock();
            final ZipFile zip;
            if (closed) {
                zip = new ZipFile(file);
                closed = false;
            } else {
                zip = openedFile;
            }
            return zip;
        } finally {
            lock.unlock();
        }
    }

    private void removeTask(final long task) throws IOException {
        tasks.remove(task);
        try {
            lock.lock();
            if (isComplete()) {
                closed = true;
                openedFile.close();
                openedFile = null;
            }
        } finally {
            lock.unlock();
        }
    }

    private class TaskedZipFileInputStream extends InputStream {

        private final InputStream stream;

        private final long task;

        public TaskedZipFileInputStream(final InputStream stream, final long task) {
            this.stream = stream;
            this.task = task;
        }

        @Override
        public int read() throws IOException {
            return stream.read();
        }

        @Override
        public void close() throws IOException {
            super.close();
            removeTask(task);
        }
    }
}
