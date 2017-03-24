package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IUShR;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIUShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IUShRReader implements Reader<IUShR> {

    @Override
    public IUShR read(final ByteCodeReader input) throws IOException {
        return DefaultIUShR.INSTANCE;
    }
}