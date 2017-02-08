package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLdC;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldcReader implements Reader<DefaultLdC> {

    @Override
    public DefaultLdC read(final ByteCodeReader input) throws IOException {
        return new DefaultLdC(input.readByteConstant());
    }
}