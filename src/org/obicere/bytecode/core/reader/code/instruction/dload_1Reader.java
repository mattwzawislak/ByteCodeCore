package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dload_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_1Reader implements Reader<dload_1> {

    @Override
    public dload_1 read(final ByteCodeReader input) throws IOException {
        return dload_1.INSTANCE;
    }
}