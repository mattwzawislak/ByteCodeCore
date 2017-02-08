package org.obicere.bytecode.core.util.factory;

import org.obicere.bytecode.core.reader.DefaultReaders;
import org.obicere.bytecode.core.reader.Readers;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.InputStream;

/**
 */
public class ByteCodeReaderFactory {

    private static final Readers READERS = new DefaultReaders();

    private ByteCodeReaderFactory() {
    }

    public static ByteCodeReader createReader(final InputStream stream) {
        return new ByteCodeReader(READERS, stream);
    }

    public static ByteCodeReader createReader(final InputStream stream, final int offset) {
        return new ByteCodeReader(READERS, stream, offset);
    }

    public static ByteCodeReader createReader(final byte[] bytes) {
        return new ByteCodeReader(READERS, bytes);
    }

    public static ByteCodeReader createReader(final int offset, final byte[] bytes) {
        return new ByteCodeReader(READERS, offset, bytes);
    }

    public static ByteCodeReader createReader(final ByteCodeReader information, final byte[] bytes) {
        return new ByteCodeReader(information, bytes);
    }

    public static Readers getReaders() {
        return READERS;
    }
}
