package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantPool;
import org.javacore.constant.ConstantUtf8;
import org.javacore.constant.Constants;

/**
 * @author Obicere
 */
public class DefaultConstantClass extends AbstractConstant implements ConstantClass {

    private final int nameIndex;

    public DefaultConstantClass(final ConstantPool constantPool, final int nameIndex) {
        super(constantPool, Constants.CONSTANT_CLASS);
        this.nameIndex = nameIndex;
    }

    @Override
    public String getName() {
        final ConstantUtf8 constantName = (ConstantUtf8) constantPool.get(nameIndex);
        return constantName.getValue();
    }

    @Override
    public String toString() {
        return getName();
    }
}
