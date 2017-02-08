package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.Constant;
import org.javacore.constant.ConstantPool;

/**
 * @author Obicere
 */
public abstract class AbstractConstant implements Constant {

    private final int tag;

    protected final ConstantPool constantPool;

    public AbstractConstant(final ConstantPool constantPool, final int tag) {
        this.constantPool = constantPool;
        this.tag = tag;
    }

    @Override
    public final int getTag() {
        return tag;
    }

}
