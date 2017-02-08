package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultJSR_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class jsr_wReader implements Reader<DefaultJSR_w> {

    @Override
    public DefaultJSR_w read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultJSR_w(input.readWideLabel(index));
    }
}