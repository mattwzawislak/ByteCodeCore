package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IDiv;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIDiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IDivReader implements Reader<IDiv> {

    @Override
    public IDiv read(final ByteCodeReader input) throws IOException {
        return DefaultIDiv.INSTANCE;
    }
}