package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iaddReader implements Reader<DefaultIAdd> {

    @Override
    public DefaultIAdd read(final ByteCodeReader input) throws IOException {
        return DefaultIAdd.INSTANCE;
    }
}