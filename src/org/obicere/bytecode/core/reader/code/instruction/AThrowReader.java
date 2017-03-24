package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AThrow;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAThrow;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AThrowReader implements Reader<AThrow> {

    @Override
    public AThrow read(final ByteCodeReader input) throws IOException {
        return DefaultAThrow.INSTANCE;
    }
}
