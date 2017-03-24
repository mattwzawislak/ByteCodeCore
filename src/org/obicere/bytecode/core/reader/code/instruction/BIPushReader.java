package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.BIPush;
import org.obicere.bytecode.core.objects.code.instruction.DefaultBIPush;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BIPushReader implements Reader<BIPush> {

    @Override
    public BIPush read(final ByteCodeReader input) throws IOException {
        return new DefaultBIPush(input.readByte());
    }
}
