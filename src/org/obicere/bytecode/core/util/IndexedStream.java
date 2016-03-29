package org.obicere.bytecode.core.util;

import java.io.IOException;

/**
 */
public interface IndexedStream extends AutoCloseable {

    public int getIndex();

    public int peek() throws IOException;

    @Override
    public void close() throws IOException;
}
