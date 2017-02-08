package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLMul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lmulReader implements Reader<DefaultLMul> {

    @Override
    public DefaultLMul read(final ByteCodeReader input) throws IOException {
        return DefaultLMul.INSTANCE;
    }
}