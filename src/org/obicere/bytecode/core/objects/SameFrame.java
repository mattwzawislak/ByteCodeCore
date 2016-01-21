package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class SameFrame extends StackMapFrame {

    public static final String IDENTIFIER = "SameFrame";

    public SameFrame(final int frameType) {
        super(frameType);
    }

    @Override
    public int getOffsetDelta() {
        return getFrameType();
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
