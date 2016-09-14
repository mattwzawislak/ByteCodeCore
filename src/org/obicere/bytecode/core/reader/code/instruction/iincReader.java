package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iinc;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iincReader implements Reader<iinc> {

    @Override
    public iinc read(final ByteCodeReader input) throws IOException {
        return new iinc(input.readUnsignedByte(), input.readUnsignedByte());
    }
}