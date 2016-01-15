package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantMethodType extends Constant {

    public static final String IDENTIFIER = "ConstantMethodType";

    private static final String NAME = "MethodType";

    private final int descriptorIndex;

    public ConstantMethodType(final int descriptorIndex) {
        super(ConstantReader.CONSTANT_METHOD_TYPE);
        this.descriptorIndex = descriptorIndex;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return constantPool.getAsString(descriptorIndex);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
