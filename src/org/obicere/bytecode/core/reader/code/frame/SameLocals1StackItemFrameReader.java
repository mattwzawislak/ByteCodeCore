package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.SameLocals1StackItemFrame;
import org.javacore.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.objects.code.frame.DefaultSameLocals1StackItemFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SameLocals1StackItemFrameReader implements Reader<SameLocals1StackItemFrame> {

    @Override
    public SameLocals1StackItemFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final VerificationTypeInfo info = input.read(Identifier.VERIFICATION_TYPE_INFO);
        return new DefaultSameLocals1StackItemFrame(frameType, info);
    }
}
