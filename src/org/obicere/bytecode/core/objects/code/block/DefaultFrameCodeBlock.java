package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.block.FrameCodeBlock;
import org.javacore.code.block.label.Label;
import org.javacore.code.frame.StackMapFrame;

/**
 */
public class DefaultFrameCodeBlock extends AbstractCodeBlock implements FrameCodeBlock {

    private StackMapFrame frame;

    public DefaultFrameCodeBlock(final StackMapFrame frame, final Label address) {
        super(address);
        if (frame == null) {
            throw new NullPointerException("frame must be non-null");
        }

        this.frame = frame;
    }

    @Override
    public StackMapFrame getFrame() {
        return frame;
    }

    @Override
    public String getName() {
        return "F" + address.getAddress();
    }
}
