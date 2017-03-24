package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LCmp;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLCmp;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LCmpReader implements Reader<LCmp> {

    @Override
    public LCmp read(final ByteCodeReader input) throws IOException {
        return DefaultLCmp.INSTANCE;
    }
}