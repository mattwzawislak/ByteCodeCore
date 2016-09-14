package org.obicere.bytecode.core.reader.code.frame;

import org.obicere.bytecode.core.objects.code.frame.StackMapFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StackMapFrameReader implements Reader<StackMapFrame> {

    //JVMS (§4.7.4)
    private static final int MAXIMUM_SAME                              = 63;
    private static final int MAXIMUM_SAME_LOCALS_1_STACK_ITEM          = 127;
    private static final int MAXIMUM_UNUSED                            = 246;
    private static final int MAXIMUM_SAME_LOCALS_1_STACK_ITEM_EXTENDED = 247;
    private static final int MAXIMUM_CHOP                              = 250;
    private static final int MAXIMUM_SAME_EXTENDED                     = 251;
    private static final int MAXIMUM_APPEND                            = 254;
    private static final int MAXIMUM_FULL                              = 255;

    private final VerificationTypeInfoReader verificationTypeInfo = new VerificationTypeInfoReader();

    private final AppendFrameReader appendFrame = new AppendFrameReader(verificationTypeInfo);

    private final ChopFrameReader chopFrame = new ChopFrameReader();

    private final FullFrameReader fullFrame = new FullFrameReader(verificationTypeInfo);

    private final SameFrameExtendedReader sameFrameExtended = new SameFrameExtendedReader();

    private final SameFrameReader sameFrame = new SameFrameReader();

    private final SameLocals1StackItemFrameExtendedReader sameLocals1StackItemFrameExtended = new SameLocals1StackItemFrameExtendedReader(verificationTypeInfo);

    private final SameLocals1StackItemFrameReader sameLocals1StackItemFrame = new SameLocals1StackItemFrameReader(verificationTypeInfo);

    @Override
    public StackMapFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.peek();
        if (frameType <= MAXIMUM_SAME) {
            return sameFrame.read(input);
        } else if (frameType <= MAXIMUM_SAME_LOCALS_1_STACK_ITEM) {
            return sameLocals1StackItemFrame.read(input);
        } else if (frameType <= MAXIMUM_UNUSED) {
            throw new ClassFormatError("reached a reserved frame type.");
        } else if (frameType <= MAXIMUM_SAME_LOCALS_1_STACK_ITEM_EXTENDED) {
            return sameLocals1StackItemFrameExtended.read(input);
        } else if (frameType <= MAXIMUM_CHOP) {
            return chopFrame.read(input);
        } else if (frameType <= MAXIMUM_SAME_EXTENDED) {
            return sameFrameExtended.read(input);
        } else if (frameType <= MAXIMUM_APPEND) {
            return appendFrame.read(input);
        } else if (frameType <= MAXIMUM_FULL) {
            return fullFrame.read(input);
        } else {
            throw new AssertionError("if reached, data input stream read byte failed.");
        }
    }
}
