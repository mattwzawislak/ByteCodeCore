package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IShR;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IShRReader implements Reader<IShR> {

    @Override
    public IShR read(final ByteCodeReader input) throws IOException {
        return DefaultIShR.INSTANCE;
    }
}