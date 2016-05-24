package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ireturn;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ireturnReader implements Reader<ireturn> {

    @Override
    public ireturn read(final IndexedDataInputStream input) throws IOException {
        return ireturn.INSTANCE;
    }
}