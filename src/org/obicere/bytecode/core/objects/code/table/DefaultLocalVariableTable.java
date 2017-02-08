package org.obicere.bytecode.core.objects.code.table;

import org.javacore.code.LocalVariable;
import org.javacore.code.table.LocalVariableTable;

/**
 */
public class DefaultLocalVariableTable implements LocalVariableTable {

    public static final LocalVariableTable EMPTY = new DefaultLocalVariableTable(new LocalVariable[0]);

    private LocalVariable[] types;

    public DefaultLocalVariableTable(final LocalVariable[] types) {
        this.types = types;
    }

    @Override
    public LocalVariable[] getLocalVariables() {
        return types;
    }
}
