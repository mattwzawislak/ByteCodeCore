package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DALoadReader implements Reader<DALoad> {

    @Override
    public DALoad read(final ByteCodeReader input) throws IOException {
        return DefaultDALoad.INSTANCE;
    }
}