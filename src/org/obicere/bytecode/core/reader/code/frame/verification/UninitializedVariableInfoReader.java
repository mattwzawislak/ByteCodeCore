package org.obicere.bytecode.core.reader.code.frame.verification;

import org.javacore.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.frame.verification.UninitializedVariableInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class UninitializedVariableInfoReader implements Reader<UninitializedVariableInfo> {
    @Override
    public UninitializedVariableInfo read(final ByteCodeReader input) throws IOException {
        // offset from 0 (start) of code array
        final Label label = input.readLabel(0);
        return new UninitializedVariableInfo(label);
    }
}
