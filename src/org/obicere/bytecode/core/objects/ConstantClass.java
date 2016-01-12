package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantClass extends Constant {

    public static final String IDENTIFIER = "ConstantClass";

    private static final String NAME = "Class";

    private final int nameIndex;

    public ConstantClass(final int nameIndex) {
        super(ConstantReader.CONSTANT_CLASS);
        this.nameIndex = nameIndex;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    @Override
    public String getName() {
        return NAME;
    }
    @Override
    public String toString(final ConstantPool constantPool) {
        // nameIndex points to a ConstantUtf8
        return constantPool.getAsString(nameIndex);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
