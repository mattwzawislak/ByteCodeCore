package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lneg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lnegReader implements Reader<lneg> {

    @Override
    public lneg read(final ByteCodeReader input) throws IOException {
        return lneg.INSTANCE;
    }
}