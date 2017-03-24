package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DSub;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDSub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DSubReader implements Reader<DSub> {

    @Override
    public DSub read(final ByteCodeReader input) throws IOException {
        return DefaultDSub.INSTANCE;
    }
}