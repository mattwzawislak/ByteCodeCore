package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ishl;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ishlReader implements Reader<ishl> {

    @Override
    public ishl read(final ByteCodeReader input) throws IOException {
        return ishl.INSTANCE;
    }
}