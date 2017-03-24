package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IRem;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IRemReader implements Reader<IRem> {

    @Override
    public IRem read(final ByteCodeReader input) throws IOException {
        return DefaultIRem.INSTANCE;
    }
}