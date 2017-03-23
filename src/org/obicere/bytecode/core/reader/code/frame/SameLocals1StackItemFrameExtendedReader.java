package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.SameLocals1StackItemFrameExtended;
import org.javacore.code.frame.verification.VerificationTypeInfo;
import org.obicere.bytecode.core.objects.code.frame.DefaultSameLocals1StackItemFrameExtended;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SameLocals1StackItemFrameExtendedReader implements Reader<SameLocals1StackItemFrameExtended> {

    @Override
    public SameLocals1StackItemFrameExtended read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();
        final VerificationTypeInfo info = input.read(Identifier.VERIFICATION_TYPE_INFO);
        return new DefaultSameLocals1StackItemFrameExtended(frameType, offsetDelta, info);
    }
}
