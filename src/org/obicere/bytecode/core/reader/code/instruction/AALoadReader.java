package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AALoadReader implements Reader<AALoad> {

    @Override
    public AALoad read(final ByteCodeReader input) throws IOException {
        return DefaultAALoad.INSTANCE;
    }
}
