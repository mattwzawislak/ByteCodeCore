package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class ByteCodeElement {

    private int start;
    private int end;

    public final int getStart() {
        return start;
    }

    public final int getEnd() {
        return end;
    }

    public final void setBounds(final int start, final int end) {
        if (start < 0 || start >= end) {
            throw new IllegalArgumentException("invalid range: " + start + ", " + end);
        }
        this.start = start;
        this.end = end;
    }

    public final int getLength() {
        return end - start;
    }

    public abstract String getIdentifier();

}
