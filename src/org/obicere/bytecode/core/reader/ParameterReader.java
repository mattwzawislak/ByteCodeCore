package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Parameter;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ParameterReader implements Reader<Parameter> {
    @Override
    public Parameter read(final IndexedDataInputStream input) throws IOException {
        final int nameIndex = input.readUnsignedShort();
        final int accessFlags = input.readUnsignedShort();
        return new Parameter(nameIndex, accessFlags);
    }
}
