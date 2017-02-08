package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.OffsetTarget;

/**
 * @author Obicere
 */
public class DefaultOffsetTarget extends AbstractTarget implements OffsetTarget {

    private final int offset;

    public DefaultOffsetTarget(final int targetType, final int offset) {
        super(targetType);
        this.offset = offset;
    }

    @Override
    public int getOffset() {
        return offset;
    }
}
