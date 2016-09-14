package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.caload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class caloadReader implements Reader<caload> {

    @Override
    public caload read(final ByteCodeReader input) throws IOException {
        return caload.INSTANCE;
    }
}
