package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lsub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lsubReader implements Reader<lsub> {

    @Override
    public lsub read(final ByteCodeReader input) throws IOException {
        return lsub.INSTANCE;
    }
}