package org.obicere.bytecode.core.objects.code.frame;

/**
 * @author Obicere
 */
public class ChopFrame extends StackMapFrame {

    public static final String IDENTIFIER = "ChopFrame";

    private final int offset;

    public ChopFrame(final int frameType, final int offset) {
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
