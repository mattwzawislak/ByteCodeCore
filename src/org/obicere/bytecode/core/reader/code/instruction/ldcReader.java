package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LdC;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLdC;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LdCReader implements Reader<LdC> {

    @Override
    public LdC read(final ByteCodeReader input) throws IOException {
        return new DefaultLdC(input.readByteConstant());
    }
}