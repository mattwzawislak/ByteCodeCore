package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ldc;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldcReader implements Reader<ldc> {

    @Override
    public ldc read(final ByteCodeReader input) throws IOException {
        return new ldc(input.readByteConstant());
    }
}