package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.FullFrame;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class DefaultFullFrame extends AbstractStackMapFrame implements FullFrame {

    private final int offset;

    private final VerificationTypeInfo[] locals;
    private final VerificationTypeInfo[] stack;

    public DefaultFullFrame(final int frameType, final int offset, final VerificationTypeInfo[] locals, final VerificationTypeInfo[] stack) {
        super(frameType);

        if (locals == null) {
            throw new NullPointerException("locals must be non-null");
        }

        if (stack == null) {
            throw new NullPointerException("stack must be non-null");
        }

        this.offset = offset;
        this.locals = locals;
        this.stack = stack;
    }

    @Override
    public VerificationTypeInfo[] getLocals() {
        return locals;
    }

    @Override
    public VerificationTypeInfo[] getStack() {
        return stack;
    }

    @Override
    public int getOffsetDelta() {
        return offset;
    }

    @Override
    public String getName() {
        return "FullFrame";
    }
}
