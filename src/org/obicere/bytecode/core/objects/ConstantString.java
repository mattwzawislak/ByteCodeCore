package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantString extends Constant {

    public static final String IDENTIFIER = "ConstantString";

    private static final String NAME = "String";

    private final int stringIndex;

    public ConstantString(final int stringIndex) {
        super(ConstantReader.CONSTANT_STRING);
        this.stringIndex = stringIndex;
    }

    public int getStringIndex() {
        return stringIndex;
    }

    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return constantPool.getAsString(stringIndex);
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
