package org.obicere.bytecode.core.reader.code.frame;

import org.obicere.bytecode.core.objects.code.frame.AppendFrame;
import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AppendFrameReader implements Reader<AppendFrame> {

    private final VerificationTypeInfoReader verificationTypeInfo;

    public AppendFrameReader(final VerificationTypeInfoReader verificationTypeInfo) {
        this.verificationTypeInfo = verificationTypeInfo;
    }

    @Override
    public AppendFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();
        final int numberOfLocals = frameType - 251; //JVMS (§4.7.4)
        final VerificationTypeInfo[] locals = new VerificationTypeInfo[numberOfLocals];
        for (int i = 0; i < numberOfLocals; i++) {
            locals[i] = verificationTypeInfo.read(input);
        }
        return new AppendFrame(frameType, offsetDelta, locals);
    }
}
