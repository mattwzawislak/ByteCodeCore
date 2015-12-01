package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantInvokeDynamic;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantInvokeDynamicReader implements Reader<ConstantInvokeDynamic> {
    @Override
    public ConstantInvokeDynamic read(final IndexedDataInputStream input) throws IOException {
        return new ConstantInvokeDynamic(input.readUnsignedShort(), input.readUnsignedShort());
    }
}
