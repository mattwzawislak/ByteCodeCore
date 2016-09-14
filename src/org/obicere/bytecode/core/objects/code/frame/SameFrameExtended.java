package org.obicere.bytecode.core.objects.code.frame;

/**
 * @author Obicere
 */
public class SameFrameExtended extends StackMapFrame {

    public static final String IDENTIFIER = "SameFrameExtended";

    private final int offset;

    public SameFrameExtended(final int frameType, final int offset) {
        super(frameType);
        this.offset = offset;
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
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
