package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IXor;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIXor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IXorReader implements Reader<IXor> {

    @Override
    public IXor read(final ByteCodeReader input) throws IOException {
        return DefaultIXor.INSTANCE;
    }
}