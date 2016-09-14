package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iand;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iandReader implements Reader<iand> {

    @Override
    public iand read(final ByteCodeReader input) throws IOException {
        return iand.INSTANCE;
    }
}