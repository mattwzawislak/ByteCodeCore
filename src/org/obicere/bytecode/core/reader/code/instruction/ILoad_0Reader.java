package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ILoad_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ILoad_0Reader implements Reader<ILoad_0> {

    @Override
    public ILoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_0.INSTANCE;
    }
}