package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIAnd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iandReader implements Reader<DefaultIAnd> {

    @Override
    public DefaultIAnd read(final ByteCodeReader input) throws IOException {
        return DefaultIAnd.INSTANCE;
    }
}