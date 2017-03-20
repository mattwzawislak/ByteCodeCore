package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.StackMapFrame;

/**
 * @author Obicere
 */
public abstract class AbstractStackMapFrame implements StackMapFrame {

    private final int frameType;

    public AbstractStackMapFrame(final int frameType) {
        this.frameType = frameType;
    }

    @Override
    public int getFrameType() {
        return frameType;
    }
}
