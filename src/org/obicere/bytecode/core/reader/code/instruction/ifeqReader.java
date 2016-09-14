package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifeq;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifeqReader implements Reader<ifeq> {

    @Override
    public ifeq read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifeq(input.readLabel(index));
    }
}