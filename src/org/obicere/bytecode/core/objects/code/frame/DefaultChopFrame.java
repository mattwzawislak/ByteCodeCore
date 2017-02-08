package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.ChopFrame;

/**
 * @author Obicere
 */
public class DefaultChopFrame extends AbstractStackMapFrame implements ChopFrame {

    private final int offset;

    public DefaultChopFrame(final int frameType, final int offset) {
        super(frameType);
        this.offset = offset;
    }

    @Override
    public int getOffsetDelta() {
        return offset;
    }

    @Override
    public String getName() {
        return "ChopFrame";
    }
}
