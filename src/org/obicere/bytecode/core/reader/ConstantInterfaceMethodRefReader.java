package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantInterfaceMethodRef;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantInterfaceMethodRefReader implements Reader<ConstantInterfaceMethodRef> {
    @Override
    public ConstantInterfaceMethodRef read(final IndexedDataInputStream input) throws IOException {
        return new ConstantInterfaceMethodRef(input.readUnsignedShort(), input.readUnsignedShort());
    }
}
