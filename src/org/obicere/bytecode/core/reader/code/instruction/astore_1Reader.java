package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.astore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_1Reader implements Reader<astore_1> {

    @Override
    public astore_1 read(final ByteCodeReader input) throws IOException {
        return astore_1.INSTANCE;
    }
}
