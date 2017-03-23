package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DCmpL;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDCmpL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DCmpLReader implements Reader<DCmpL> {

    @Override
    public DCmpL read(final ByteCodeReader input) throws IOException {
        return DefaultDCmpL.INSTANCE;
    }
}