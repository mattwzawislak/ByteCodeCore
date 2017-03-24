package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DLoad_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDLoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DLoad_0Reader implements Reader<DLoad_0> {

    @Override
    public DLoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultDLoad_0.INSTANCE;
    }
}