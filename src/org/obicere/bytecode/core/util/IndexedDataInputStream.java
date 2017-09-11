package org.obicere.bytecode.core.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A modified {@link java.io.DataInputStream} that provides capabilities
 * regarding the current index of its stream. The purpose of this is to
 * allow alignment and step operations in both directions (forwards or
 * backwards). These operations may provide useful in situations where two
 * separate formats overlap and the required information cannot be easily
 * transmitted.
 * <p>
 * This is built off of the
 * {@link IndexedByteArrayInputStream} to allow
 * indexing. Since both of these define an offset and index, both must be
 * accessible under different contexts. The index of the stream from its
 * start is accessible through the
 * {@link IndexedDataInputStream#getIndex()},
 * and the index of the stream including its logical offset is accessible
 * through the
 * {@link IndexedDataInputStream#getLogicalIndex()}
 * method.
 * <h1>The difference between logical and stream indices:</h1>
 * <p>
 * The logical offset is the offset of the start of the stream in relation
 * to a larger scope. This allows the stream to maintain both indices to
 * provide proper indexing for both contexts. This can be shown with a
 * fairly simple example and a sub-list of some larger list of
 * <code>byte</code>s:
 * <p>
 * Consider <code>A</code> is a <code>byte</code> array with
 * <code>10</code> elements:
 * <p>
 * <code>A = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]</code>
 * <p>
 * Suppose a sub-list <code>B</code> is defined on the second half of the
 * <code>byte</code> array <code>A</code>:
 * <p>
 * <code>B = [5, 6, 7, 8, 9]</code>
 * <p>
 * <code>B</code> exists as the sub-list of a larger array, and in context
 * has some offset from the original array. In this case, the logical
 * index of <code>B</code> is equal to <code>5</code>. This is because
 * the offset of <code>B</code> in terms of <code>A</code> is equal to
 * <code>5</code>. And, since no data is processed, the stream index over
 * <code>B</code> is equal to <code>0</code> and is pointing to the start
 * of the list <code>B</code>.
 * <p>
 * Should a single <code>byte</code> then the logical index would become
 * <code>6</code> and the stream index would be come <code>1</code>. This
 * shows that the two indices correspond to the two different pointers in
 * the two different - yet parallel - lists.
 *
 * @author Obicere
 * @version 0.0
 * @see IndexedByteArrayInputStream
 * @since 0.0
 */
public class IndexedDataInputStream extends DataInputStream {

    /**
     * The logical offset of the stream. This is combined with the current
     * index of the stream to provide the logical index.
     */
    private final int offset;

    /**
     * The underlying indexed stream that provides access to the current
     * index of the stream. This is also the stream that contains all of
     * the data to be processed.
     */
    private final IndexedInputStream input;

    /**
     * Constructs a new stream with no logical offset. This will read all
     * of the <code>byte</code> values from the <code>bytes</code> array.
     * The logical offset is set to <code>0</code> therefore the logical
     * index and the stream index will be identical.
     * <p>
     * Therefore, this should not be used when streaming a sub-list of
     * <code>bytes</code>.
     *
     * @param bytes The list of bytes for the stream to process.
     */
    public IndexedDataInputStream(final byte[] bytes) {
        this(0, bytes);
    }

    /**
     * Constructs a new stream with a set logical offset. This will read
     * all of the <code>byte</code> values from the <code>bytes</code>
     * array. The logical offset is specified by <code>offset</code>
     * therefore the logical index will be equal to the stream index plus
     * the <code>offset</code>. However, it should be noted that although
     * allowed, negative offsets may provide obscure results.
     * <p>
     * This should be used when dealing with a sub-list of
     * <code>bytes</code>.
     *
     * @param bytes The list of bytes for the stream to process.
     */
    public IndexedDataInputStream(final int offset, final byte[] bytes) {
        this(new IndexedByteArrayInputStream(bytes), offset);
    }

    public IndexedDataInputStream(final InputStream stream) {
        this(stream, 0);
    }

    public IndexedDataInputStream(final InputStream stream, final int offset) {
        this(new IndexedInputStream(stream), offset);
    }

    private IndexedDataInputStream(final IndexedInputStream stream, final int offset) {
        super(stream);
        this.offset = offset;
        this.input = stream;
    }

    /**
     * Gets the logical index of the stream. This value will be equal to
     * the stream index, accessible through
     * {@link IndexedDataInputStream#getIndex()}
     * in the case that the initial <code>offset</code> was equal to
     * <code>0</code>.
     * <p>
     * For an explanation regarding the differences between the logical
     * and stream indices, regard the documentation of
     * {@link IndexedDataInputStream}
     *
     * @return The logical index of the stream.
     */
    public int getLogicalIndex() {
        return offset + input.getIndex();
    }

    /**
     * Gets the stream index of the stream. This value will be equal to
     * the logical index, accessible through
     * {@link IndexedDataInputStream#getLogicalIndex()}
     * in the case that the initial <code>offset</code> was equal to
     * <code>0</code>.
     * <p>
     * For an explanation regarding the differences between the logical
     * and stream indices, regard the documentation of
     * {@link IndexedDataInputStream}
     *
     * @return The stream index of the stream.
     */

    public int getIndex() {
        return input.getIndex();
    }

    public int peek() throws IOException {
        return input.peek();
    }

    public int peekShort() throws IOException {
        final byte[] peek = new byte[2];
        input.peek(peek);
        return ((peek[0] & 0xFF) << 8) | (peek[1] & 0xFF);
    }

    @Override
    public void close() throws IOException {
        input.close();
    }
}
