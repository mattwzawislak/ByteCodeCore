package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class EnumElementValue extends ElementValue {

    public static final String IDENTIFIER = "EnumElementValue";

    private static final int TAG = 'e';

    private final int typeNameIndex;
    private final int constNameIndex;

    public EnumElementValue(final int typeNameIndex, final int constNameIndex) {
        super(TAG);
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
