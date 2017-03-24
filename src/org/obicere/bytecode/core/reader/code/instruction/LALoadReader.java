package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LALoadReader implements Reader<LALoad> {

    @Override
    public LALoad read(final ByteCodeReader input) throws IOException {
        return DefaultLALoad.INSTANCE;
    }
}