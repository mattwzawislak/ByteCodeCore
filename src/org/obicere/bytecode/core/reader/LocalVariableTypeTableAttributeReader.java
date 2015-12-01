package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LocalVariableType;
import org.obicere.bytecode.core.objects.LocalVariableTypeTableAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTypeTableAttributeReader implements Reader<LocalVariableTypeTableAttribute> {

    private final LocalVariableTypeReader localVariableType = new LocalVariableTypeReader();

    @Override
    public LocalVariableTypeTableAttribute read(final IndexedDataInputStream input) throws IOException {
        final int localVariableTypeTableLength = input.readUnsignedShort();
        final LocalVariableType[] localVariableTypeTable = new LocalVariableType[localVariableTypeTableLength];

        for (int i = 0; i < localVariableTypeTableLength; i++) {
            localVariableTypeTable[i] = localVariableType.read(input);
        }
        return new LocalVariableTypeTableAttribute(localVariableTypeTable);
    }
}
