package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FMul;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFMul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FMulReader implements Reader<FMul> {

    @Override
    public FMul read(final ByteCodeReader input) throws IOException {
        return DefaultFMul.INSTANCE;
    }
}