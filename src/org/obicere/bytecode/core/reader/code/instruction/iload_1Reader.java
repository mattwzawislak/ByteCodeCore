package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iload_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_1Reader implements Reader<iload_1> {

    @Override
    public iload_1 read(final ByteCodeReader input) throws IOException {
        return iload_1.INSTANCE;
    }
}