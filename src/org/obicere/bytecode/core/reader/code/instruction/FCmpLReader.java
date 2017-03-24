package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FCmpL;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFCmpL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FCmpLReader implements Reader<FCmpL> {

    @Override
    public FCmpL read(final ByteCodeReader input) throws IOException {
        return DefaultFCmpL.INSTANCE;
    }
}