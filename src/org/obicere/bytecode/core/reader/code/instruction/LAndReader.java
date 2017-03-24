package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LAnd;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLAnd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LAndReader implements Reader<LAnd> {

    @Override
    public LAnd read(final ByteCodeReader input) throws IOException {
        return DefaultLAnd.INSTANCE;
    }
}