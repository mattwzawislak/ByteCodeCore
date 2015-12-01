package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lneg;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lnegReader implements Reader<lneg> {

    @Override
    public lneg read(final IndexedDataInputStream input) throws IOException {
        return new lneg();
    }
}