package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DMul;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDMul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DMulReader implements Reader<DMul> {

    @Override
    public DMul read(final ByteCodeReader input) throws IOException {
        return DefaultDMul.INSTANCE;
    }
}