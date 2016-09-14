package org.obicere.bytecode.core.reader.code.frame;

import org.obicere.bytecode.core.objects.code.frame.FullFrame;
import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FullFrameReader implements Reader<FullFrame> {

    private final VerificationTypeInfoReader verificationTypeInfo;

    public FullFrameReader(final VerificationTypeInfoReader verificationTypeInfo) {
        this.verificationTypeInfo = verificationTypeInfo;
    }

    @Override
    public FullFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();

        final int numberOfLocals = input.readUnsignedShort();
        final VerificationTypeInfo[] locals = new VerificationTypeInfo[numberOfLocals];
        for (int i = 0; i < numberOfLocals; i++) {
            locals[i] = verificationTypeInfo.read(input);
        }

        final int numberOfStackItems = input.readUnsignedShort();
        final VerificationTypeInfo[] stack = new VerificationTypeInfo[numberOfStackItems];
        for (int i = 0; i < numberOfStackItems; i++) {
            stack[i] = verificationTypeInfo.read(input);
        }
        return new FullFrame(frameType, offsetDelta, locals, stack);
    }
}
