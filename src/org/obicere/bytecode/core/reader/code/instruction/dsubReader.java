package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dsub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dsubReader implements Reader<dsub> {

    @Override
    public dsub read(final ByteCodeReader input) throws IOException {
        return dsub.INSTANCE;
    }
}