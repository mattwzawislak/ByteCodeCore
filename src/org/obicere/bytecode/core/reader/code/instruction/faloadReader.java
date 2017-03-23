package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FALoadReader implements Reader<FALoad> {

    @Override
    public FALoad read(final ByteCodeReader input) throws IOException {
        return DefaultFALoad.INSTANCE;
    }
}