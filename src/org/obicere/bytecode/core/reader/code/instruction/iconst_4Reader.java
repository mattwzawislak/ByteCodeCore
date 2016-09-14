package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iconst_4;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_4Reader implements Reader<iconst_4> {

    @Override
    public iconst_4 read(final ByteCodeReader input) throws IOException {
        return iconst_4.INSTANCE;
    }
}