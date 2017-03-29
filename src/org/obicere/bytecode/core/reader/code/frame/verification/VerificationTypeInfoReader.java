package org.obicere.bytecode.core.reader.code.frame.verification;

import org.javacore.Identifier;
import org.javacore.code.frame.verification.VerificationTypeInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class VerificationTypeInfoReader implements Reader<VerificationTypeInfo> {

    @Override
    public VerificationTypeInfo read(final ByteCodeReader input) throws IOException {
        final int type = input.peek();
        final Identifier identifier = VerificationTypeInfos.of(type);

        if (identifier == null) {
            throw new IllegalArgumentException("No reader for input: " + type);
        }

        return input.read(identifier);
    }
}
