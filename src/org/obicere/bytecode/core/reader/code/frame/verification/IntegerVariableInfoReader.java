package org.obicere.bytecode.core.reader.code.frame.verification;

import org.obicere.bytecode.core.objects.code.frame.verification.IntegerVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class IntegerVariableInfoReader implements Reader<IntegerVariableInfo> {

    @Override
    public IntegerVariableInfo read(final ByteCodeReader input) throws IOException {
        return new IntegerVariableInfo();
    }
}
