package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIInc;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iincReader implements Reader<DefaultIInc> {

    @Override
    public DefaultIInc read(final ByteCodeReader input) throws IOException {
        return new DefaultIInc(input.readUnsignedByte(), input.readUnsignedByte());
    }
}