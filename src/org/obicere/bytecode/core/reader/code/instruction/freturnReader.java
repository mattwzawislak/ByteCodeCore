package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FReturn;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FReturnReader implements Reader<FReturn> {

    @Override
    public FReturn read(final ByteCodeReader input) throws IOException {
        return DefaultFReturn.INSTANCE;
    }
}