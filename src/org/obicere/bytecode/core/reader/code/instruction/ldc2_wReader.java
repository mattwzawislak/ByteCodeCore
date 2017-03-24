package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LdC2_w;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLdC2_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LdC2_wReader implements Reader<LdC2_w> {

    @Override
    public LdC2_w read(final ByteCodeReader input) throws IOException {
        return new DefaultLdC2_w(input.readConstant());
    }
}