package org.obicere.bytecode.core.objects.constant;

/**
 * @author Obicere
 */
public abstract class Constant {

    private final int tag;

    protected final ConstantPool constantPool;

    public Constant(final ConstantPool constantPool, final int tag) {
        this.constantPool = constantPool;
        this.tag = tag;
    }

    public final int getTag() {
        return tag;
    }

}
