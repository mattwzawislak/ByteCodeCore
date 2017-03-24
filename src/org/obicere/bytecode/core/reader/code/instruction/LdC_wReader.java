package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LdC_w;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLdC_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LdC_wReader implements Reader<LdC_w> {

    @Override
    public LdC_w read(final ByteCodeReader input) throws IOException {
        return new DefaultLdC_w(input.readConstant());
    }
}