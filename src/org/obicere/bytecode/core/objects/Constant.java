package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class Constant extends ByteCodeElement {

    private final int tag;

    public Constant(final int tag) {
        this.tag = tag;
    }

    public final int getTag() {
        return tag;
    }

    public abstract String getName();

    public abstract String toString(final ConstantPool constantPool);

}
