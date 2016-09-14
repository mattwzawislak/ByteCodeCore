package org.obicere.bytecode.core.reader.code.frame;

import org.obicere.bytecode.core.objects.code.frame.SameLocals1StackItemFrameExtended;
import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SameLocals1StackItemFrameExtendedReader implements Reader<SameLocals1StackItemFrameExtended> {

    private final VerificationTypeInfoReader verificationTypeInfo;

    public SameLocals1StackItemFrameExtendedReader(final VerificationTypeInfoReader verificationTypeInfo) {
        this.verificationTypeInfo = verificationTypeInfo;
    }

    @Override
    public SameLocals1StackItemFrameExtended read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();
        final VerificationTypeInfo info = verificationTypeInfo.read(input);
        return new SameLocals1StackItemFrameExtended(frameType, offsetDelta, info);
    }
}
