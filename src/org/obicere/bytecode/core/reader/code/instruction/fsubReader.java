package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FSub;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFSub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FSubReader implements Reader<FSub> {

    @Override
    public FSub read(final ByteCodeReader input) throws IOException {
        return DefaultFSub.INSTANCE;
    }
}