package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LMul;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLMul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LMulReader implements Reader<LMul> {

    @Override
    public LMul read(final ByteCodeReader input) throws IOException {
        return DefaultLMul.INSTANCE;
    }
}