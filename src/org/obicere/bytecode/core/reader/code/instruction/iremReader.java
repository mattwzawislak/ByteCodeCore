package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iremReader implements Reader<DefaultIRem> {

    @Override
    public DefaultIRem read(final ByteCodeReader input) throws IOException {
        return DefaultIRem.INSTANCE;
    }
}