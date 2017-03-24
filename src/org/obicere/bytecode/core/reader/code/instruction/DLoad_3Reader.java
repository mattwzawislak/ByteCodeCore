package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DLoad_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDLoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DLoad_3Reader implements Reader<DLoad_3> {

    @Override
    public DLoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultDLoad_3.INSTANCE;
    }
}