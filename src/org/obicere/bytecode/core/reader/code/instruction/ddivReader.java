package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ddiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ddivReader implements Reader<ddiv> {

    @Override
    public ddiv read(final ByteCodeReader input) throws IOException {
        return ddiv.INSTANCE;
    }
}