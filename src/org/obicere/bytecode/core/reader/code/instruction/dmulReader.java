package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dmul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dmulReader implements Reader<dmul> {

    @Override
    public dmul read(final ByteCodeReader input) throws IOException {
        return dmul.INSTANCE;
    }
}