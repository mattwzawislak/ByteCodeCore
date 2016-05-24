package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.caload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class caloadReader implements Reader<caload> {

    @Override
    public caload read(final IndexedDataInputStream input) throws IOException {
        return caload.INSTANCE;
    }
}
