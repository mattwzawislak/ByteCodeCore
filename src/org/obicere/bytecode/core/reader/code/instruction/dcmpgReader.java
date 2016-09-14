package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dcmpg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dcmpgReader implements Reader<dcmpg> {

    @Override
    public dcmpg read(final ByteCodeReader input) throws IOException {
        return dcmpg.INSTANCE;
    }
}