package org.obicere.bytecode.core.objects.code.frame;

import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class SameLocals1StackItemFrameExtended extends StackMapFrame {

    public static final String IDENTIFIER = "SameLocalsExtendedFrame";

    private final int offset;

    private final VerificationTypeInfo stack;

    public SameLocals1StackItemFrameExtended(final int frameType, final int offset, final VerificationTypeInfo stack) {
        super(frameType);

        if (stack == null) {
            throw new IllegalArgumentException("stack must be non-null");
        }

        this.offset = offset;
        this.stack = stack;
    }

    public VerificationTypeInfo getStack() {
        return stack;
    }

    @Override
    public int getOffsetDelta() {
        return offset;
    }

    @Override
    public String getName() {
        return IDENTIFIER;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
