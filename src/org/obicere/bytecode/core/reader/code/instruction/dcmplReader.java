package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dcmpl;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dcmplReader implements Reader<dcmpl> {

    @Override
    public dcmpl read(final ByteCodeReader input) throws IOException {
        return dcmpl.INSTANCE;
    }
}