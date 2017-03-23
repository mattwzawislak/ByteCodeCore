package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.LocalVariableTypeTableAttribute;
import org.javacore.code.LocalVariable;
import org.obicere.bytecode.core.objects.attribute.DefaultLocalVariableTypeTableAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTypeTableAttributeReader implements Reader<LocalVariableTypeTableAttribute> {

    @Override
    public LocalVariableTypeTableAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int localVariableTypeTableLength = input.readUnsignedShort();
        final LocalVariable[] localVariableTable = new LocalVariable[localVariableTypeTableLength];

        for (int i = 0; i < localVariableTypeTableLength; i++) {
            // we treat local variable types and local variables the same
            localVariableTable[i] = input.read(Identifier.LOCAL_VARIABLE);
        }
        return new DefaultLocalVariableTypeTableAttribute(localVariableTable);
    }
}
