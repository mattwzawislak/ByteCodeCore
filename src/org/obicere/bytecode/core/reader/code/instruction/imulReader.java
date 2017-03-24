package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IMul;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIMul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IMulReader implements Reader<IMul> {

    @Override
    public IMul read(final ByteCodeReader input) throws IOException {
        return DefaultIMul.INSTANCE;
    }
}