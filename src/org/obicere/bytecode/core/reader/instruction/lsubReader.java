package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lsub;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lsubReader implements Reader<lsub> {

    @Override
    public lsub read(final IndexedDataInputStream input) throws IOException {
        return new lsub();
    }
}