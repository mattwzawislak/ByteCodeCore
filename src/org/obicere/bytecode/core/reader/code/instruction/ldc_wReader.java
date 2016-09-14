package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ldc_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldc_wReader implements Reader<ldc_w> {

    @Override
    public ldc_w read(final ByteCodeReader input) throws IOException {
        return new ldc_w(input.readConstant());
    }
}