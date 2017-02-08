package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.Code;
import org.javacore.code.block.FrameCodeBlock;
import org.javacore.code.frame.StackMapFrame;

/**
 */
public class DefaultFrameCodeBlock extends AbstractCodeBlock implements FrameCodeBlock {

    private final StackMapFrame frame;

    private int startPC;

    public DefaultFrameCodeBlock(final Code code, final StackMapFrame frame, final int startPC) {
        super(code);
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
    public void setStartPC(final int pc) {
        this.startPC = pc;
    }

    @Override
    public String getName() {
        return "F" + startPC;
    }
}
