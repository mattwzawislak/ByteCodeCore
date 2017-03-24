package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LRem;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LRemReader implements Reader<LRem> {

    @Override
    public LRem read(final ByteCodeReader input) throws IOException {
        return DefaultLRem.INSTANCE;
    }
}