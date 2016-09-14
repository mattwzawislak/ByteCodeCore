package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.irem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iremReader implements Reader<irem> {

    @Override
    public irem read(final ByteCodeReader input) throws IOException {
        return irem.INSTANCE;
    }
}