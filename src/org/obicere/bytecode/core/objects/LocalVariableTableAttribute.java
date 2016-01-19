package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class LocalVariableTableAttribute extends Attribute {

    public static final String IDENTIFIER = "LocalVariableTableAttribute";

    private final LocalVariable[] localVariableTable;

    public LocalVariableTableAttribute(final int length, final LocalVariable[] localVariableTable) {
        super(length);
        if (localVariableTable == null) {
            throw new NullPointerException("local variable table must be non-null");
        }

        this.localVariableTable = localVariableTable;
    }

    public LocalVariable[] getLocalVariableTable() {
        return localVariableTable;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
