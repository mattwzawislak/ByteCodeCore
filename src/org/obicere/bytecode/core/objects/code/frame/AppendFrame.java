package org.obicere.bytecode.core.objects.code.frame;

import org.obicere.bytecode.core.objects.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class AppendFrame extends StackMapFrame {

    public static final String IDENTIFIER = "AppendFrame";

    private final int                    offset;
    private final VerificationTypeInfo[] locals;

    public AppendFrame(final int frameType, final int offset, final VerificationTypeInfo[] locals) {
        super(frameType);

        if (locals == null) {
            throw new NullPointerException("locals must be non-null");
        }

        this.offset = offset;
        this.locals = locals;
    }

    public int getOffset() {
        return offset;
    }

    public VerificationTypeInfo[] getLocals() {
        return locals;
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
