package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.LocalVariableTypeTableAttribute;
import org.obicere.bytecode.core.objects.code.LocalVariable;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.table.LocalVariableReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTypeTableAttributeReader implements Reader<LocalVariableTypeTableAttribute> {

    // we read in local variables instead of local variable types
    // this is because the two structures are identical and redundant to
    // have both
    private final LocalVariableReader localVariableType = new LocalVariableReader();

    @Override
    public LocalVariableTypeTableAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int localVariableTypeTableLength = input.readUnsignedShort();
        final LocalVariable[] localVariableTable = new LocalVariable[localVariableTypeTableLength];

        for (int i = 0; i < localVariableTypeTableLength; i++) {
            localVariableTable[i] = localVariableType.read(input);
        }
        return new LocalVariableTypeTableAttribute(localVariableTable);
    }
}
