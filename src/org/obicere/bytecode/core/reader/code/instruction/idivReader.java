package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.idiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class idivReader implements Reader<idiv> {

    @Override
    public idiv read(final ByteCodeReader input) throws IOException {
        return idiv.INSTANCE;
    }
}