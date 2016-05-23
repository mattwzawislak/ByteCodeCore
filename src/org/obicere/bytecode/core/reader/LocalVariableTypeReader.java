package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LocalVariableType;
import org.obicere.bytecode.core.objects.label.LazyLabel;
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

        final LazyLabel start = new LazyLabel(startPC);
        final LazyLabel end = new LazyLabel(startPC + length);

        final int nameIndex = input.readUnsignedShort();
        final int signatureIndex = input.readUnsignedShort();
        final int index = input.readUnsignedShort();

        return new LocalVariableType(start, end, nameIndex, signatureIndex, index);
    }
}
