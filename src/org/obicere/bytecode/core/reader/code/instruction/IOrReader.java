package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IOr;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIOr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IOrReader implements Reader<IOr> {

    @Override
    public IOr read(final ByteCodeReader input) throws IOException {
        return DefaultIOr.INSTANCE;
    }
}