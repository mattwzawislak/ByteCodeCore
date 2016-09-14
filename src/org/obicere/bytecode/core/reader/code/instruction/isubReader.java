package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.isub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class isubReader implements Reader<isub> {

    @Override
    public isub read(final ByteCodeReader input) throws IOException {
        return isub.INSTANCE;
    }
}