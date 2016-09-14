package org.obicere.bytecode.core.io;

import sun.misc.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 */
public class FileSource implements LeafSource {

    private final String file;

    public FileSource(final String file) {
        if (file == null || file.length() == 0) {
            throw new IllegalArgumentException("file name must be non-empty");
        }
        this.file = file;
    }

    public FileSource(final File file) {
        if (file.isDirectory() || !file.exists()) {
            throw new IllegalArgumentException("file must be an existing file");
        }
        this.file = file.getAbsolutePath();
    }

    public FileSource(final File parent, final String name) {
        if (parent != null && (!parent.isDirectory() || !parent.exists())) {
            throw new IllegalArgumentException("parent file must be an existing directory");
        }
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("file name must be non-empty");
        }
        if (parent == null) {
            this.file = name;
        } else {
            this.file = parent.getAbsolutePath() + File.separator + name;
        }
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(asFile());
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return new FileOutputStream(asFile());
    }

    @Override
    public byte[] read() throws IOException {
        final InputStream stream = getInputStream();
        // fuck you, I'm going to use sun.misc packages if I want to
        final byte[] bytes = IOUtils.readFully(stream, -1, true);

        stream.close();
        return bytes;
    }

    @Override
    public boolean write(final byte[] bytes) throws IOException {
        final OutputStream stream = getOutputStream();
        stream.write(bytes);
        stream.flush();
        stream.close();
        return true;
    }

    @Override
    public boolean exists() {
        final File file = asFile();
        return file.exists() && !file.isDirectory();
    }

    @Override
    public String getPath() {
        return file;
    }

    @Override
    public String toString() {
        return file;
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other instanceof FileSource) {
            final FileSource source = (FileSource) other;
            return source.getPath().equals(file);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return file.hashCode();
    }

    private File asFile() {
        return new File(file);
    }
}
