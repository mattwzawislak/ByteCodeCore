package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ishr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ishrReader implements Reader<ishr> {

    @Override
    public ishr read(final ByteCodeReader input) throws IOException {
        return ishr.INSTANCE;
    }
}