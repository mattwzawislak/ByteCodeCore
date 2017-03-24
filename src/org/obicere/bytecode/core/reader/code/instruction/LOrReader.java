package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LOr;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLOr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LOrReader implements Reader<LOr> {

    @Override
    public LOr read(final ByteCodeReader input) throws IOException {
        return DefaultLOr.INSTANCE;
    }
}