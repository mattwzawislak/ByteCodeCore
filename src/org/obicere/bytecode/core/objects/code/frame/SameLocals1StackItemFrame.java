package org.obicere.bytecode.core.objects.code.frame;

import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class SameLocals1StackItemFrame extends StackMapFrame {

    public static final String IDENTIFIER = "SameLocalsFrame";

    private final VerificationTypeInfo stack;

    public SameLocals1StackItemFrame(final int frameType, final VerificationTypeInfo stack) {
        super(frameType);

        if (stack == null) {
            throw new IllegalArgumentException("stack must be non-null");
        }

        this.stack = stack;
    }

    public VerificationTypeInfo getStack() {
        return stack;
    }

    @Override
    public int getOffsetDelta() {
        return getFrameType() - 64;
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
