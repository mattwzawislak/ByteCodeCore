package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IInc;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIInc;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IIncReader implements Reader<IInc> {

    @Override
    public IInc read(final ByteCodeReader input) throws IOException {
        return new DefaultIInc(input.readUnsignedByte(), input.readUnsignedByte());
    }
}