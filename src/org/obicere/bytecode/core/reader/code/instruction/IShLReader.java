package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IShL;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIShL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IShLReader implements Reader<IShL> {

    @Override
    public IShL read(final ByteCodeReader input) throws IOException {
        return DefaultIShL.INSTANCE;
    }
}