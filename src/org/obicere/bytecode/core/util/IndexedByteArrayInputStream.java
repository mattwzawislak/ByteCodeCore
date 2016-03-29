package org.obicere.bytecode.core.util;

import java.io.ByteArrayInputStream;

/**
 * A modified instance of a {@link java.io.ByteArrayInputStream} that
 * provides access to the current index of the stream. This also allows
 * step operations in both directions (forwards and backwards). These
 * operations may provide useful in situations where two separate formats
 * overlap and the required information cannot be easily transmitted.
 * <p>
 * The intent of this class is to be used in the
 * {@link IndexedDataInputStream} to provide
 * readily available access to the position for alignment and step-back
 * procedures.
 *
 * @author Obicere
 * @version 0.0
 * @see IndexedDataInputStream
 * @since 0.0
 */
public class IndexedByteArrayInputStream extends ByteArrayInputStream implements IndexedStream {

    /**
     * {@inheritDoc}
     */
    public IndexedByteArrayInputStream(final byte[] bytes) {
        super(bytes);
    }

    /**
     * {@inheritDoc}
     */
    public IndexedByteArrayInputStream(final byte[] bytes, final int offset, final int length) {
        super(bytes, offset, length);
    }

    /**
     * Retrieves the current index of the stream. This value includes the
     * initial offset set by the constructor of the super class.
     * <p>
     * Therefore, it should hold that:
     * <p>
     * <code>number of bytes read = getIndex() - offset</code>
     * <p>
     * So if an alignment of <code>4</code> is required and a new instance
     * of this class is instantiated with some non-zero offset. It might
     * not be the case that after exactly <code>4</code> bytes are read
     * that the stream is aligned by <code>4</code>. Therefore, careful
     * consideration must be used when using an offset.
     *
     * @return The current index of the stream.
     */
    @Override
    public int getIndex() {
        return pos;
    }

    @Override
    public int peek() {
        final int next = read();
        if (next > 0) {
            pos--;
        }
        return next;
    }
}
