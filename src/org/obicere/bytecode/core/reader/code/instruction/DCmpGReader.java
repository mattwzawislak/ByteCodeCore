package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DCmpG;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDCmpG;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DCmpGReader implements Reader<DCmpG> {

    @Override
    public DCmpG read(final ByteCodeReader input) throws IOException {
        return DefaultDCmpG.INSTANCE;
    }
}