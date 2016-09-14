package org.obicere.bytecode.core.reader.code.frame.verification;

import org.obicere.bytecode.core.objects.code.frame.verification.DoubleVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class DoubleVariableInfoReader implements Reader<DoubleVariableInfo> {
    @Override
    public DoubleVariableInfo read(final ByteCodeReader input) throws IOException {
        return new DoubleVariableInfo();
    }
}
