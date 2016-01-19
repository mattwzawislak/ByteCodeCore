package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class LocalVariableTypeTableAttribute extends Attribute {

    public static final String IDENTIFIER = "LocalVariableTypeTableAttribute";

    private final LocalVariableType[] localVariableTypeTable;

    public LocalVariableTypeTableAttribute(final int length, final LocalVariableType[] localVariableTypeTable) {
        super(length);
        if (localVariableTypeTable == null) {
            throw new NullPointerException("local variable type table must be non-null");
        }

        this.localVariableTypeTable = localVariableTypeTable;
    }

    public LocalVariableType[] getLocalVariableTypeTable() {
        return localVariableTypeTable;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
