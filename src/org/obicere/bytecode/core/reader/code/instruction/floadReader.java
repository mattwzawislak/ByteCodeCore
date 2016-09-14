package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class floadReader implements Reader<fload> {

    @Override
    public fload read(final ByteCodeReader input) throws IOException {
       return new fload(input.readUnsignedByte());
    }
}