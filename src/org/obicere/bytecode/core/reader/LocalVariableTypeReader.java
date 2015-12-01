package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LocalVariableType;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LocalVariableTypeReader implements Reader<LocalVariableType> {
    @Override
    public LocalVariableType read(final IndexedDataInputStream input) throws IOException {
        final int startPC = input.readUnsignedShort();
        final int length = input.readUnsignedShort();
        final int nameIndex = input.readUnsignedShort();
        final int signatureIndex = input.readUnsignedShort();
        final int index = input.readUnsignedShort();
        return new LocalVariableType(startPC, length, nameIndex, signatureIndex, index);
    }
}
