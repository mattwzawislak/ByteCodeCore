package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ldc2_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldc2_wReader implements Reader<ldc2_w> {

    @Override
    public ldc2_w read(final ByteCodeReader input) throws IOException {
        return new ldc2_w(input.readConstant());
    }
}