package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.code.table.LocalVariable;
import org.obicere.bytecode.core.objects.code.block.label.LabelFactory;

/**
 * @author Obicere
 */
public class LocalVariableTableAttribute extends Attribute {

    public static final String IDENTIFIER = "LocalVariableTableAttribute";

    private final LocalVariable[] localVariableTable;

    public LocalVariableTableAttribute(final LocalVariable[] localVariableTable) {
        if (localVariableTable == null) {
            throw new NullPointerException("local variable table must be non-null");
        }

        this.localVariableTable = localVariableTable;
    }

    // TODO move into LocalVariableTable type code.table
    public LocalVariable[] getLocalVariableTable() {
        return localVariableTable;
    }

    public void initializeLabels(final LabelFactory factory){
        for(final LocalVariable local : localVariableTable){
            local.initializeLabels(factory);
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
