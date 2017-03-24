package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IReturn;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IReturnReader implements Reader<IReturn> {

    @Override
    public IReturn read(final ByteCodeReader input) throws IOException {
        return DefaultIReturn.INSTANCE;
    }
}