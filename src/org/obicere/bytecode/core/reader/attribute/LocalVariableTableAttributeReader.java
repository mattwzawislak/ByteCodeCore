package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.LocalVariableTableAttribute;
import org.javacore.code.LocalVariable;
import org.obicere.bytecode.core.objects.attribute.DefaultLocalVariableTableAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTableAttributeReader implements Reader<LocalVariableTableAttribute> {

    @Override
    public LocalVariableTableAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final int localVariableTableLength = input.readUnsignedShort();
        final LocalVariable[] localVariableTable = new LocalVariable[localVariableTableLength];

        for (int i = 0; i < localVariableTableLength; i++) {
            localVariableTable[i] = input.read(Identifier.LOCAL_VARIABLE);
        }
        return new DefaultLocalVariableTableAttribute(localVariableTable);
    }
}
