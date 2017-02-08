package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ishrReader implements Reader<DefaultIShR> {

    @Override
    public DefaultIShR read(final ByteCodeReader input) throws IOException {
        return DefaultIShR.INSTANCE;
    }
}