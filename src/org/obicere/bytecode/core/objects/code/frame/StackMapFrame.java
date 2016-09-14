package org.obicere.bytecode.core.objects.code.frame;

import org.obicere.bytecode.core.Identifiable;

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
