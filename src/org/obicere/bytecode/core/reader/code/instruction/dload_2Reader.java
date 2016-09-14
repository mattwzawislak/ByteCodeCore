package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dload_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_2Reader implements Reader<dload_2> {

    @Override
    public dload_2 read(final ByteCodeReader input) throws IOException {
        return dload_2.INSTANCE;
    }
}