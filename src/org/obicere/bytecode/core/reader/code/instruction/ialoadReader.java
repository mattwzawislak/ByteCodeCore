package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IALoadReader implements Reader<IALoad> {

    @Override
    public IALoad read(final ByteCodeReader input) throws IOException {
        return DefaultIALoad.INSTANCE;
    }
}