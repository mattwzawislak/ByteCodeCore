package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.areturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class areturnReader implements Reader<areturn> {

    @Override
    public areturn read(final ByteCodeReader input) throws IOException {
        return areturn.INSTANCE;
    }
}
