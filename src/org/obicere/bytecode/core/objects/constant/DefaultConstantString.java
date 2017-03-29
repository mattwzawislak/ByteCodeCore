package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantPool;
import org.javacore.constant.ConstantString;
import org.javacore.constant.ConstantUtf8;
import org.javacore.constant.Constants;

/**
 * @author Obicere
 */
public class DefaultConstantString extends AbstractConstant implements ConstantString {

    private final int stringIndex;

    public DefaultConstantString(final ConstantPool constantPool, final int stringIndex) {
        super(constantPool, Constants.CONSTANT_STRING);
        this.stringIndex = stringIndex;
    }

    @Override
    public String getValue() {
        final ConstantUtf8 constant = (ConstantUtf8) constantPool.get(stringIndex);
        return constant.getValue();
    }

    @Override
    public String toString() {
        return getValue();
    }
}
