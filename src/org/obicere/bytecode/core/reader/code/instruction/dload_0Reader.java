package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dload_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_0Reader implements Reader<dload_0> {

    @Override
    public dload_0 read(final ByteCodeReader input) throws IOException {
        return dload_0.INSTANCE;
    }
}