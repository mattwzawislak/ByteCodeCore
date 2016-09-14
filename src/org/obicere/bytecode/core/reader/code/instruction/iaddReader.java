package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iadd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iaddReader implements Reader<iadd> {

    @Override
    public iadd read(final ByteCodeReader input) throws IOException {
        return iadd.INSTANCE;
    }
}