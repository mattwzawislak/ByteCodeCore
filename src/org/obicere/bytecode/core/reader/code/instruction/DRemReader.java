package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DRem;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DRemReader implements Reader<DRem> {

    @Override
    public DRem read(final ByteCodeReader input) throws IOException {
        return DefaultDRem.INSTANCE;
    }
}