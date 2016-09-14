package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.istore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_2Reader implements Reader<istore_2> {

    @Override
    public istore_2 read(final ByteCodeReader input) throws IOException {
        return istore_2.INSTANCE;
    }
}