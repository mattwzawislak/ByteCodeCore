package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ILoad_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ILoad_2Reader implements Reader<ILoad_2> {

    @Override
    public ILoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_2.INSTANCE;
    }
}