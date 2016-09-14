package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.land;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class landReader implements Reader<land> {

    @Override
    public land read(final ByteCodeReader input) throws IOException {
        return land.INSTANCE;
    }
}