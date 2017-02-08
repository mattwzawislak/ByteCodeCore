package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.SameLocals1StackItemFrame;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class DefaultSameLocals1StackItemFrame extends AbstractStackMapFrame implements SameLocals1StackItemFrame {

    private final VerificationTypeInfo stack;

    public DefaultSameLocals1StackItemFrame(final int frameType, final VerificationTypeInfo stack) {
        super(frameType);

        if (stack == null) {
            throw new IllegalArgumentException("stack must be non-null");
        }

        this.stack = stack;
    }

    @Override
    public VerificationTypeInfo getStackItem() {
        return stack;
    }

    @Override
    public int getOffsetDelta() {
        return getFrameType() - 64;
    }

    @Override
    public String getName() {
        return "SameLocalsFrame";
    }
}
