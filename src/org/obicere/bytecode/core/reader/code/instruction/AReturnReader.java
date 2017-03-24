package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AReturn;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AReturnReader implements Reader<AReturn> {

    @Override
    public AReturn read(final ByteCodeReader input) throws IOException {
        return DefaultAReturn.INSTANCE;
    }
}
