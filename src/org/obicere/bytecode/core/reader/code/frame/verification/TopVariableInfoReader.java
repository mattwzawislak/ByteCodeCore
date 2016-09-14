package org.obicere.bytecode.core.reader.code.frame.verification;

import org.obicere.bytecode.core.objects.code.frame.verification.TopVariableInfo;
import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 */
public class TopVariableInfoReader implements Reader<VerificationTypeInfo> {

    @Override
    public VerificationTypeInfo read(final ByteCodeReader input) throws IOException {
        return new TopVariableInfo();
    }
}
