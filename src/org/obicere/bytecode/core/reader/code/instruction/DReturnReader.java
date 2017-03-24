package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DReturn;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DReturnReader implements Reader<DReturn> {

    @Override
    public DReturn read(final ByteCodeReader input) throws IOException {
        return DefaultDReturn.INSTANCE;
    }
}