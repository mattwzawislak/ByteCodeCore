package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.astore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_0Reader implements Reader<astore_0> {

    @Override
    public astore_0 read(final ByteCodeReader input) throws IOException {
        return astore_0.INSTANCE;
    }
}
