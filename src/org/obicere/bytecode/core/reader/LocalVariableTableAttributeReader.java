package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LocalVariable;
import org.obicere.bytecode.core.objects.LocalVariableTableAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTableAttributeReader implements Reader<LocalVariableTableAttribute> {

    private final LocalVariableReader localVariable = new LocalVariableReader();

    @Override
    public LocalVariableTableAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int localVariableTableLength = input.readUnsignedShort();
        final LocalVariable[] localVariableTable = new LocalVariable[localVariableTableLength];

        for (int i = 0; i < localVariableTableLength; i++) {
            localVariableTable[i] = localVariable.read(input);
        }
        return new LocalVariableTableAttribute(length, localVariableTable);
    }
}
