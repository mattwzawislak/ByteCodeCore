package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iload_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_2Reader implements Reader<iload_2> {

    @Override
    public iload_2 read(final ByteCodeReader input) throws IOException {
        return iload_2.INSTANCE;
    }
}