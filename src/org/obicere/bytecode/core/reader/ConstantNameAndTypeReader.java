package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantNameAndType;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantNameAndTypeReader implements Reader<ConstantNameAndType> {
    @Override
    public ConstantNameAndType read(final IndexedDataInputStream input) throws IOException {
        return new ConstantNameAndType(input.readUnsignedShort(), input.readUnsignedShort());
    }
}
