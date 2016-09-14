package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dload_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_3Reader implements Reader<dload_3> {

    @Override
    public dload_3 read(final ByteCodeReader input) throws IOException {
        return dload_3.INSTANCE;
    }
}