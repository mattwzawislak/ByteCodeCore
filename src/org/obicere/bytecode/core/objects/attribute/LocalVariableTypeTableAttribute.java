package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.code.block.label.LabelFactory;
import org.obicere.bytecode.core.objects.code.table.LocalVariable;

/**
 * @author Obicere
 */
public class LocalVariableTypeTableAttribute extends Attribute {

    public static final String IDENTIFIER = "LocalVariableTypeTableAttribute";

    private final LocalVariable[] localVariableTypeTable;

    public LocalVariableTypeTableAttribute(final LocalVariable[] localVariableTypeTable) {
        if (localVariableTypeTable == null) {
            throw new NullPointerException("local variable type table must be non-null");
        }

        this.localVariableTypeTable = localVariableTypeTable;
    }

    // TODO move into LocalVariableTable type code.table
    public LocalVariable[] getLocalVariableTable() {
        return localVariableTypeTable;
    }

    public void initializeLabels(final LabelFactory factory){
        for(final LocalVariable local : localVariableTypeTable){
            local.initializeLabels(factory);
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
