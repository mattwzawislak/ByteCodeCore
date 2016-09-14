package org.obicere.bytecode.core.reader.code.frame.verification;

import org.obicere.bytecode.core.objects.code.frame.verification.UninitializedThisVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class UninitializedThisVariableInfoReader implements Reader<UninitializedThisVariableInfo> {
    @Override
    public UninitializedThisVariableInfo read(final ByteCodeReader input) throws IOException {
        return new UninitializedThisVariableInfo();
    }
}
