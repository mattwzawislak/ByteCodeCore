package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.SameFrame;

/**
 * @author Obicere
 */
public class DefaultSameFrame extends AbstractStackMapFrame implements SameFrame {

    public DefaultSameFrame(final int frameType) {
        super(frameType);
    }

    @Override
    public int getOffsetDelta() {
        return getFrameType();
    }

    @Override
    public String getName() {
        return "SameFrame";
    }
}
