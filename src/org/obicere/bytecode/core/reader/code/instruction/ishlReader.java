package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIShL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ishlReader implements Reader<DefaultIShL> {

    @Override
    public DefaultIShL read(final ByteCodeReader input) throws IOException {
        return DefaultIShL.INSTANCE;
    }
}