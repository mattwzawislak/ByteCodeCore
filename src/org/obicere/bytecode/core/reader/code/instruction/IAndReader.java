package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IAnd;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIAnd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IAndReader implements Reader<IAnd> {

    @Override
    public IAnd read(final ByteCodeReader input) throws IOException {
        return DefaultIAnd.INSTANCE;
    }
}