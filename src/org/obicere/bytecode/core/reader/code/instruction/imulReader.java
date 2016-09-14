package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.imul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class imulReader implements Reader<imul> {

    @Override
    public imul read(final ByteCodeReader input) throws IOException {
        return imul.INSTANCE;
    }
}