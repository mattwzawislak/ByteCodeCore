package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class EnumElementValue extends ElementValue {

    public static final String IDENTIFIER = "EnumElementValue";

    private final int typeNameIndex;
    private final int constNameIndex;

    public EnumElementValue(final int typeNameIndex, final int constNameIndex) {
        super(ElementValueReader.TAG_ENUM);
        this.typeNameIndex = typeNameIndex;
        this.constNameIndex = constNameIndex;
    }

    public int getTypeNameIndex() {
        return typeNameIndex;
    }

    public int getConstNameIndex() {
        return constNameIndex;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
