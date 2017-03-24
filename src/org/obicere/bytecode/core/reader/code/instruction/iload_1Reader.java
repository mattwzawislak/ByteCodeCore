package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ILoad_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ILoad_1Reader implements Reader<ILoad_1> {

    @Override
    public ILoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultILoad_1.INSTANCE;
    }
}