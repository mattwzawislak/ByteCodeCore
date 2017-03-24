package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LReturn;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LReturnReader implements Reader<LReturn> {

    @Override
    public LReturn read(final ByteCodeReader input) throws IOException {
        return DefaultLReturn.INSTANCE;
    }
}