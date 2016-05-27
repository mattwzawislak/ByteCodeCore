package org.obicere.bytecode.core.io;

import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;

/**
 */
public class ZipEntrySource implements LeafSource {

    private final ZipSystem system;
    private final String    file;
    private final String    name;

    public ZipEntrySource(final String file, final String name) {
        this(ZipSystem.getSystemZipSystem(), file, name);
    }

    public ZipEntrySource(final ZipSystem system, final String file, final String name) {
        if (file == null) {
            throw new NullPointerException("file must be non-null.");
        }
        if (name == null) {
            throw new NullPointerException("name must be non-null.");
        }
        if (system == null) {
            this.system = ZipSystem.getSystemZipSystem();
        } else {
            this.system = system;
        }
        this.file = file;
        this.name = name;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        final ZipArchiveSource zipFile = getZipFile();

        return zipFile.getInputStream(name);
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException("writing to archives is not currently supported.");
    }

    public byte[] read() throws IOException {
        final ZipArchiveSource zipFile = system.getZipFile(file);

        final InputStream stream = zipFile.getInputStream(name);
        final byte[] bytes = IOUtils.readFully(stream, -1, true);

        stream.close();
        return bytes;
    }

    @Override
    public boolean write(final byte[] bytes) throws IOException {
        throw new UnsupportedOperationException("writing to archives is not currently supported.");
    }

    @Override
    public boolean exists() {
        try {
            final ZipArchiveSource zipFile = getZipFile();
            final ZipEntry entry = zipFile.getEntry(name);

            return entry != null;
        } catch (final IOException e) {
            Logger.getGlobal().log(Level.FINE, "File existence check failed:");
            Logger.getGlobal().log(Level.FINE, e.getMessage(), e);
            return false;
        }
    }

    @Override
    public String getPath() {
        return file + "!" + name;
    }

    private ZipArchiveSource getZipFile() throws IOException {
        return system.getZipFile(file);
    }
}
