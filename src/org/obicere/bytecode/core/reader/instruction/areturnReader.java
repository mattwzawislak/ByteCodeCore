package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.areturn;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class areturnReader implements Reader<areturn> {

    @Override
    public areturn read(final IndexedDataInputStream input) throws IOException {
        return areturn.INSTANCE;
    }
}
