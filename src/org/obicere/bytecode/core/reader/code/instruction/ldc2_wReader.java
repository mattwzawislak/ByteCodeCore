package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLdC2_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldc2_wReader implements Reader<DefaultLdC2_w> {

    @Override
    public DefaultLdC2_w read(final ByteCodeReader input) throws IOException {
        return new DefaultLdC2_w(input.readConstant());
    }
}