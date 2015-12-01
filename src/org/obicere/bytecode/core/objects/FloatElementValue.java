package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class FloatElementValue extends ElementValue {

    private static final int TAG = 'F';

    private final int constantValueIndex;

    public FloatElementValue(final int constantValueIndex) {
        super(TAG);
        this.constantValueIndex = constantValueIndex;
    }

    public int getConstantValueIndex() {
        return constantValueIndex;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        final ConstantFloat constant = (ConstantFloat) builder.getConstantPool().get(constantValueIndex);
        builder.add(constant.getBytes());
    }
}
