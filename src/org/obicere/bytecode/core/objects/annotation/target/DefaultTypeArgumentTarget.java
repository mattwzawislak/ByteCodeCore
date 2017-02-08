package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.TypeArgumentTarget;

/**
 * @author Obicere
 */
public class DefaultTypeArgumentTarget extends AbstractTarget implements TypeArgumentTarget {

    private final int offset;

    private final int typeArgumentIndex;

    public DefaultTypeArgumentTarget(final int targetType, final int offset, final int typeArgumentIndex) {
        super(targetType);
        this.offset = offset;
        this.typeArgumentIndex = typeArgumentIndex;
    }

    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public int getTypeArgumentIndex() {
        return typeArgumentIndex;
    }
}
