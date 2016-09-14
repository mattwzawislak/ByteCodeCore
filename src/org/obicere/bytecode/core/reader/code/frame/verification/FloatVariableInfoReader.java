package org.obicere.bytecode.core.reader.code.frame.verification;

import org.obicere.bytecode.core.objects.code.frame.verification.FloatVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class FloatVariableInfoReader implements Reader<FloatVariableInfo> {
    @Override
    public FloatVariableInfo read(final ByteCodeReader input) throws IOException {
        return new FloatVariableInfo();
    }
}
