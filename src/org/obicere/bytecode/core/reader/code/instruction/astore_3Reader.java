package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.astore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_3Reader implements Reader<astore_3> {

    @Override
    public astore_3 read(final ByteCodeReader input) throws IOException {
        return astore_3.INSTANCE;
    }
}
