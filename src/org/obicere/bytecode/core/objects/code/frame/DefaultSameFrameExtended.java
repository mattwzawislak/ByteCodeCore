package org.obicere.bytecode.core.objects.code.frame;

import org.javacore.code.frame.SameFrameExtended;

/**
 * @author Obicere
 */
public class DefaultSameFrameExtended extends AbstractStackMapFrame implements SameFrameExtended {

    private final int offset;

    public DefaultSameFrameExtended(final int frameType, final int offset) {
        super(frameType);
        this.offset = offset;
    }

    @Override
    public int getOffsetDelta() {
        return offset;
    }

    @Override
    public String getName() {
        return "SameFrameExtended";
    }
}
