package org.obicere.bytecode.core.objects.code.frame;

import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class FullFrame extends StackMapFrame {

    public static final String IDENTIFIER = "FullFrame";

    private final int offset;

    private final VerificationTypeInfo[] locals;
    private final VerificationTypeInfo[] stack;

    public FullFrame(final int frameType, final int offset, final VerificationTypeInfo[] locals, final VerificationTypeInfo[] stack) {
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

    public VerificationTypeInfo[] getLocals() {
        return locals;
    }

    public VerificationTypeInfo[] getStack() {
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
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
