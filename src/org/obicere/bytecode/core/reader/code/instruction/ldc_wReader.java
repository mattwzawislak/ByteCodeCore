package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLdC_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldc_wReader implements Reader<DefaultLdC_w> {

    @Override
    public DefaultLdC_w read(final ByteCodeReader input) throws IOException {
        return new DefaultLdC_w(input.readConstant());
    }
}