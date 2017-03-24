package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AConst_Null;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAConst_Null;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AConst_NullReader implements Reader<AConst_Null> {

    @Override
    public AConst_Null read(final ByteCodeReader input) throws IOException {
        return DefaultAConst_Null.INSTANCE;
    }
}
