package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ExceptionsAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ExceptionsAttributeReader implements Reader<ExceptionsAttribute> {
    @Override
    public ExceptionsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int numberOfExceptions = input.readUnsignedShort();
        final int[] exceptionIndexTable = new int[numberOfExceptions];
        for(int i = 0; i < numberOfExceptions; i++){
            exceptionIndexTable[i] = input.readUnsignedShort();
        }
        return new ExceptionsAttribute(length, exceptionIndexTable);
    }
}
