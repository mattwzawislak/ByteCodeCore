package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.JSR;
import org.obicere.bytecode.core.objects.code.instruction.DefaultJSR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class JSRReader implements Reader<JSR> {

    @Override
    public JSR read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultJSR(input.readLabel(index));
    }
}