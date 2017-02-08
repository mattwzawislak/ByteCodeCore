package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dreturnReader implements Reader<DefaultDReturn> {

    @Override
    public DefaultDReturn read(final ByteCodeReader input) throws IOException {
        return DefaultDReturn.INSTANCE;
    }
}