package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Return;
import org.obicere.bytecode.core.objects.code.instruction.DefaultReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ReturnReader implements Reader<Return> {

    @Override
    public Return read(final ByteCodeReader input) throws IOException {
        return DefaultReturn.INSTANCE;
    }
}