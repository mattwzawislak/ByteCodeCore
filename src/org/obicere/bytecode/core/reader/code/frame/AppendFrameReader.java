package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.AppendFrame;
import org.javacore.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.objects.code.frame.DefaultAppendFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AppendFrameReader implements Reader<AppendFrame> {

    @Override
    public AppendFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();
        final int numberOfLocals = frameType - 251; //JVMS (§4.7.4)
        final VerificationTypeInfo[] locals = new VerificationTypeInfo[numberOfLocals];
        for (int i = 0; i < numberOfLocals; i++) {
            locals[i] = input.read(Identifier.VERIFICATION_TYPE_INFO);
        }
        return new DefaultAppendFrame(frameType, offsetDelta, locals);
    }
}
