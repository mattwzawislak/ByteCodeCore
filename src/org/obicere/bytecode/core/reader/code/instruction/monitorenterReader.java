package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.monitorenter;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class monitorenterReader implements Reader<monitorenter> {

    @Override
    public monitorenter read(final ByteCodeReader input) throws IOException {
        return monitorenter.INSTANCE;
    }
}