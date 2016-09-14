package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iconst_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_3Reader implements Reader<iconst_3> {

    @Override
    public iconst_3 read(final ByteCodeReader input) throws IOException {
        return iconst_3.INSTANCE;
    }
}