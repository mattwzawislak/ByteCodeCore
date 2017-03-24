package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FRem;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FRemReader implements Reader<FRem> {

    @Override
    public FRem read(final ByteCodeReader input) throws IOException {
        return DefaultFRem.INSTANCE;
    }
}