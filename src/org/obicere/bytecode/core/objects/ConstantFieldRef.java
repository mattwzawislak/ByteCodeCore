package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantFieldRef extends Constant {

    public static final String IDENTIFIER = "ConstantFieldRef";

    private static final String NAME = "FieldRef";

    private final int classIndex;

    private final int nameAndTypeIndex;

    public ConstantFieldRef(final int classIndex, final int nameAndTypeIndex) {
        super(ConstantReader.CONSTANT_FIELD_REF);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return constantPool.getAsString(classIndex) + ";" + constantPool.getAsString(nameAndTypeIndex);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
