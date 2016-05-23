package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.label.LabelFactory;

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

    public void initializeLabels(final LabelFactory factory){
        for(final LocalVariableType local : localVariableTypeTable){
            local.initializeLabels(factory);
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
