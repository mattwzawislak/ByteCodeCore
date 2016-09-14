package org.obicere.bytecode.core.reader.code.frame;

import org.obicere.bytecode.core.objects.code.frame.SameLocals1StackItemFrame;
import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SameLocals1StackItemFrameReader implements Reader<SameLocals1StackItemFrame> {

    private final VerificationTypeInfoReader verificationTypeInfo;

    public SameLocals1StackItemFrameReader(final VerificationTypeInfoReader verificationTypeInfo) {
        this.verificationTypeInfo = verificationTypeInfo;
    }

    @Override
    public SameLocals1StackItemFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final VerificationTypeInfo info = verificationTypeInfo.read(input);
        return new SameLocals1StackItemFrame(frameType, info);
    }
}
