package org.obicere.bytecode.core.reader.code.frame.verification;

import org.javacore.code.frame.verification.NullVariableInfo;
import org.obicere.bytecode.core.objects.code.frame.verification.DefaultNullVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class NullVariableInfoReader implements Reader<NullVariableInfo> {
    @Override
    public NullVariableInfo read(final ByteCodeReader input) throws IOException {
        return DefaultNullVariableInfo.getInstance();
    }
}
