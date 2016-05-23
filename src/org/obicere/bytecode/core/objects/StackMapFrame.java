package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class StackMapFrame implements Identifiable {

    private final int frameType;

    public StackMapFrame(final int frameType) {
        this.frameType = frameType;
    }

    public int getFrameType() {
        return frameType;
    }

    public abstract int getOffsetDelta();

    public abstract String getName();
}
