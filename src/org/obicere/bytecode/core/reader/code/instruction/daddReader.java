package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dadd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class daddReader implements Reader<dadd> {

    @Override
    public dadd read(final ByteCodeReader input) throws IOException {
        return dadd.INSTANCE;
    }
}