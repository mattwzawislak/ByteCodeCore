package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lxor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lxorReader implements Reader<lxor> {

    @Override
    public lxor read(final ByteCodeReader input) throws IOException {
        return lxor.INSTANCE;
    }
}