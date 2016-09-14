package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lshl;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lshlReader implements Reader<lshl> {

    @Override
    public lshl read(final ByteCodeReader input) throws IOException {
        return lshl.INSTANCE;
    }
}