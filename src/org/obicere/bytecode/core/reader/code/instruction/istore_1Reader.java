package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.istore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_1Reader implements Reader<istore_1> {

    @Override
    public istore_1 read(final ByteCodeReader input) throws IOException {
        return istore_1.INSTANCE;
    }
}