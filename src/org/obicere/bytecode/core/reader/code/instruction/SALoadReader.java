package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.SALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultSALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SALoadReader implements Reader<SALoad> {

    @Override
    public SALoad read(final ByteCodeReader input) throws IOException {
        return DefaultSALoad.INSTANCE;
    }
}