package org.obicere.bytecode.core.objects.code.block;

import org.obicere.bytecode.core.objects.code.frame.StackMapFrame;

/**
 */
public class FrameCodeBlock extends CodeBlock {

    public static final String IDENTIFIER = "FrameCodeBlock";

    private final StackMapFrame frame;

    private final int startPC;

    public FrameCodeBlock(final StackMapFrame frame, final int startPC) {
        if (frame == null) {
            throw new NullPointerException("frame must be non-null");
        }

        this.frame = frame;
        this.startPC = startPC;
    }

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

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
