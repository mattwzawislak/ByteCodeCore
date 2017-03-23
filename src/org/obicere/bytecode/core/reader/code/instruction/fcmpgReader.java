package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FCmpG;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFCmpG;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FCmpGReader implements Reader<FCmpG> {

    @Override
    public FCmpG read(final ByteCodeReader input) throws IOException {
        return DefaultFCmpG.INSTANCE;
    }
}