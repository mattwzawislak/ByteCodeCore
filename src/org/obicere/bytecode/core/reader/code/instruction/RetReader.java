package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Ret;
import org.obicere.bytecode.core.objects.code.instruction.DefaultRet;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RetReader implements Reader<Ret> {

    @Override
    public Ret read(final ByteCodeReader input) throws IOException {
        return new DefaultRet(input.readUnsignedByte());
    }
}