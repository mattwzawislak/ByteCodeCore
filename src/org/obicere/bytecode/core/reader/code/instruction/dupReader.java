package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDup;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dupReader implements Reader<DefaultDup> {

    @Override
    public DefaultDup read(final ByteCodeReader input) throws IOException {
        return DefaultDup.INSTANCE;
    }
}