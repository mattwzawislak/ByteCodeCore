package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IAdd;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIAdd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IAddReader implements Reader<IAdd> {

    @Override
    public IAdd read(final ByteCodeReader input) throws IOException {
        return DefaultIAdd.INSTANCE;
    }
}