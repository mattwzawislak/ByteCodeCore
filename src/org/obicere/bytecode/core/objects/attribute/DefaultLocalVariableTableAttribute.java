package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.LocalVariableTableAttribute;
import org.javacore.code.LocalVariable;

/**
 * @author Obicere
 */
public class DefaultLocalVariableTableAttribute extends AbstractAttribute implements LocalVariableTableAttribute {

    private final LocalVariable[] localVariableTable;

    public DefaultLocalVariableTableAttribute(final LocalVariable[] localVariableTable) {
        super(Attributes.LOCAL_VARIABLE_TABLE_ATTRIBUTE_NAME);
        if (localVariableTable == null) {
            throw new NullPointerException("local variable table must be non-null");
        }

        this.localVariableTable = localVariableTable;
    }

    @Override
    public LocalVariable[] getTable() {
        return localVariableTable;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
