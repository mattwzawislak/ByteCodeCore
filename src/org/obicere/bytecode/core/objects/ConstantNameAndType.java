package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantNameAndType extends Constant {

    public static final String IDENTIFIER = "ConstantNameAndType";

    private static final String NAME = "NameAndType";

    private final int nameIndex;

    private final int descriptorIndex;

    public ConstantNameAndType(final int nameIndex, final int descriptorIndex) {
        super(ConstantReader.CONSTANT_NAME_AND_TYPE);
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
    }

    public int getNameIndex() {
        return nameIndex;
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
        return constantPool.getAsString(nameIndex) + ";" + constantPool.getAsString(descriptorIndex);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
