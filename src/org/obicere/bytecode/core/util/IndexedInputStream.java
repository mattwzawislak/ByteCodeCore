package org.obicere.bytecode.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/**
 */
public class IndexedInputStream extends InputStream implements IndexedStream {

    private int position = 0;

    private final PushbackInputStream stream;

    public IndexedInputStream(final InputStream stream) {
        this.stream = new PushbackInputStream(stream);
    }

    public int getIndex() {
        return position;
    }

    @Override
    public int peek() throws IOException {
        final int read = read();
        if (read < 0) {
            return read;
        }
        stream.unread(read);
        return read;
    }

    @Override
    public int read() throws IOException {
        final int read = stream.read();
        if (read >= 0) {
            position++;
        }
        return read;
    }

    @Override
    public int read(final byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        final int read = stream.read(b, off, len);
        if (read >= 0) {
            position += read;
        }
        return read;
    }

    @Override
    public void close() throws IOException {
        stream.close();
    }
}
