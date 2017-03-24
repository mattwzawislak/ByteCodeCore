package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FLoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FLoadReader implements Reader<FLoad> {

    @Override
    public FLoad read(final ByteCodeReader input) throws IOException {
       return new DefaultFLoad(input.readUnsignedByte());
    }
}