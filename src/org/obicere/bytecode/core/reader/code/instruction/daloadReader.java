package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.daload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class daloadReader implements Reader<daload> {

    @Override
    public daload read(final ByteCodeReader input) throws IOException {
        return daload.INSTANCE;
    }
}