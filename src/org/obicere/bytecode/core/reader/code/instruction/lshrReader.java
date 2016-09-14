package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lshr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lshrReader implements Reader<lshr> {

    @Override
    public lshr read(final ByteCodeReader input) throws IOException {
        return lshr.INSTANCE;
    }
}