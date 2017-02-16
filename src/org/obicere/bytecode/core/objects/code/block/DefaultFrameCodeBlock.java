package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.block.FrameCodeBlock;
import org.javacore.code.frame.StackMapFrame;

/**
 */
public class DefaultFrameCodeBlock implements FrameCodeBlock {

    private final StackMapFrame frame;

    private int startPC;

    public DefaultFrameCodeBlock(final StackMapFrame frame, final int startPC) {
        if (frame == null) {
            throw new NullPointerException("frame must be non-null");
        }

        this.frame = frame;
        this.startPC = startPC;
    }

    @Override
    public StackMapFrame getFrame() {
        return frame;
    }

    @Override
    public int getStartPC() {
        return startPC;
    }

    @Override
    public String getName() {
        return "F" + startPC;
    }
}
