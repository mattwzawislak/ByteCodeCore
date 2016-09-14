package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iconst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_1Reader implements Reader<iconst_1> {

    @Override
    public iconst_1 read(final ByteCodeReader input) throws IOException {
        return iconst_1.INSTANCE;
    }
}