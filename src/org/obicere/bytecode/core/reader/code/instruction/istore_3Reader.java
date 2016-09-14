package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.istore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_3Reader implements Reader<istore_3> {

    @Override
    public istore_3 read(final ByteCodeReader input) throws IOException {
        return istore_3.INSTANCE;
    }
}