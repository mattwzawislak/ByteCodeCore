package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.SameLocals1StackItemFrameExtended;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class DefaultSameLocals1StackItemFrameExtended extends AbstractStackMapFrame implements SameLocals1StackItemFrameExtended {

    private final int offset;

    private final VerificationTypeInfo stack;

    public DefaultSameLocals1StackItemFrameExtended(final int frameType, final int offset, final VerificationTypeInfo stack) {
        super(frameType);

        if (stack == null) {
            throw new IllegalArgumentException("stack must be non-null");
        }

        this.offset = offset;
        this.stack = stack;
    }

    @Override
    public VerificationTypeInfo getStackItem() {
        return stack;
    }

    @Override
    public int getOffsetDelta() {
        return offset;
    }

    @Override
    public String getName() {
        return "SameLocalsExtendedFrame";
    }
}
