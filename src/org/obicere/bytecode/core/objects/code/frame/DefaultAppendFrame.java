package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.AppendFrame;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public class DefaultAppendFrame extends AbstractStackMapFrame implements AppendFrame {

    private final int                    offset;
    private final VerificationTypeInfo[] locals;

    public DefaultAppendFrame(final int frameType, final int offset, final VerificationTypeInfo[] locals) {
        super(frameType);

        if (locals == null) {
            throw new NullPointerException("locals must be non-null");
        }

        this.offset = offset;
        this.locals = locals;
    }

    @Override
    public VerificationTypeInfo[] getLocals() {
        return locals;
    }

    @Override
    public int getOffsetDelta() {
        return offset;
    }

    @Override
    public String getName() {
        return "AppendFrame";
    }
}
