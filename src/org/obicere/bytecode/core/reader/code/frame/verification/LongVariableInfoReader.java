package org.obicere.bytecode.core.reader.code.frame.verification;

import org.javacore.code.frame.verification.LongVariableInfo;
import org.obicere.bytecode.core.objects.code.frame.verification.DefaultLongVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class LongVariableInfoReader implements Reader<LongVariableInfo> {
    @Override
    public LongVariableInfo read(final ByteCodeReader input) throws IOException {
        return DefaultLongVariableInfo.getInstance();
    }
}
