package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iconst_5;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_5Reader implements Reader<iconst_5> {

    @Override
    public iconst_5 read(final ByteCodeReader input) throws IOException {
        return iconst_5.INSTANCE;
    }
}