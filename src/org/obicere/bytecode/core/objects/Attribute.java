package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class Attribute extends ByteCodeElement {

    private final int length;

    public Attribute(final int length) {
        this.length = length;
    }

    public int getAttributeLength() {
        return length;
    }
}
