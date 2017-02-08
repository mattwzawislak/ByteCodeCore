package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fdiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fdivReader implements Reader<fdiv> {

    @Override
    public fdiv read(final ByteCodeReader input) throws IOException {
        return fdiv.INSTANCE;
    }
}