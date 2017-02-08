package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iastoreReader implements Reader<DefaultIAStore> {

    @Override
    public DefaultIAStore read(final ByteCodeReader input) throws IOException {
        return DefaultIAStore.INSTANCE;
    }
}