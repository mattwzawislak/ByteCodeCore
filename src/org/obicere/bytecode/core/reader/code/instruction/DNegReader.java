package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DNeg;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDNeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DNegReader implements Reader<DNeg> {

    @Override
    public DNeg read(final ByteCodeReader input) throws IOException {
        return DefaultDNeg.INSTANCE;
    }
}