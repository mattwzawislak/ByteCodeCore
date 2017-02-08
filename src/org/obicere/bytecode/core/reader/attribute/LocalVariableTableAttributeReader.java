package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.LocalVariableTableAttribute;
import org.obicere.bytecode.core.objects.code.LocalVariable;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.table.LocalVariableReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTableAttributeReader implements Reader<LocalVariableTableAttribute> {

    private final LocalVariableReader localVariable = new LocalVariableReader();

    @Override
    public LocalVariableTableAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int localVariableTableLength = input.readUnsignedShort();
        final LocalVariable[] localVariableTable = new LocalVariable[localVariableTableLength];

        for (int i = 0; i < localVariableTableLength; i++) {
            localVariableTable[i] = localVariable.read(input);
        }
        return new LocalVariableTableAttribute(localVariableTable);
    }
}
