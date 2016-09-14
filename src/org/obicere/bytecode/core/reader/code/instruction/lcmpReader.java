package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lcmp;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lcmpReader implements Reader<lcmp> {

    @Override
    public lcmp read(final ByteCodeReader input) throws IOException {
        return lcmp.INSTANCE;
    }
}