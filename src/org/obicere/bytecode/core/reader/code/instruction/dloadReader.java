package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dloadReader implements Reader<dload> {

    @Override
    public dload read(final ByteCodeReader input) throws IOException {
        return new dload(input.readUnsignedByte());
    }
}