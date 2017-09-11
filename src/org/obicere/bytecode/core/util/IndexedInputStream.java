package org.obicere.bytecode.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/**
 */
public class IndexedInputStream extends InputStream implements IndexedStream {

    private int position = 0;

    private final PushbackInputStream input;

    public IndexedInputStream(final InputStream inputStream) {
        this.input = new PushbackInputStream(inputStream, 1024);
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
        input.unread(read);
        return read;
    }

    public int peek(final byte[] bytes) throws IOException {
        final int read = read(bytes);
        if (read < 0) {
            return read;
        }
        input.unread(bytes, 0, read);
        return read;
    }

    @Override
    public int read() throws IOException {
        final int read = input.read();
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
        final int read = input.read(b, off, len);
        if (read >= 0) {
            position += read;
        }
        return read;
    }

    @Override
    public void close() throws IOException {
        input.close();
    }

    @Override
    public int available() throws IOException {
        return input.available();
    }
}
