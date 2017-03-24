package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DDiv;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDDiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DDivReader implements Reader<DDiv> {

    @Override
    public DDiv read(final ByteCodeReader input) throws IOException {
        return DefaultDDiv.INSTANCE;
    }
}