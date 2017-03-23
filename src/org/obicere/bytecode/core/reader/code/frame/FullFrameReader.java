package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.FullFrame;
import org.javacore.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.objects.code.frame.DefaultFullFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FullFrameReader implements Reader<FullFrame> {

    @Override
    public FullFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();

        final int numberOfLocals = input.readUnsignedShort();
        final VerificationTypeInfo[] locals = new VerificationTypeInfo[numberOfLocals];
        for (int i = 0; i < numberOfLocals; i++) {
            locals[i] = input.read(Identifier.VERIFICATION_TYPE_INFO);
        }

        final int numberOfStackItems = input.readUnsignedShort();
        final VerificationTypeInfo[] stack = new VerificationTypeInfo[numberOfStackItems];
        for (int i = 0; i < numberOfStackItems; i++) {
            stack[i] = input.read(Identifier.VERIFICATION_TYPE_INFO);
        }
        return new DefaultFullFrame(frameType, offsetDelta, locals, stack);
    }
}
