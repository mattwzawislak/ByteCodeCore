package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.ThrowsTarget;

/**
 * @author Obicere
 */
public class DefaultThrowsTarget extends AbstractTarget implements ThrowsTarget {

    private final int throwsTypeIndex;

    public DefaultThrowsTarget(final int targetType, final int throwsTypeIndex) {
        super(targetType);
        this.throwsTypeIndex = throwsTypeIndex;
    }

    @Override
    public int getThrowsTypeIndex() {
        return throwsTypeIndex;
    }
}
