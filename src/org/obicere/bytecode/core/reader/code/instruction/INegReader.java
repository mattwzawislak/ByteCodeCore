package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.INeg;
import org.obicere.bytecode.core.objects.code.instruction.DefaultINeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class INegReader implements Reader<INeg> {

    @Override
    public INeg read(final ByteCodeReader input) throws IOException {
        return DefaultINeg.INSTANCE;
    }
}