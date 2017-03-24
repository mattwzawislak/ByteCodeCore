package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LSub;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLSub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LSubReader implements Reader<LSub> {

    @Override
    public LSub read(final ByteCodeReader input) throws IOException {
        return DefaultLSub.INSTANCE;
    }
}