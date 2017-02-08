package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.SuperTypeTarget;

/**
 * @author Obicere
 */
public class DefaultSuperTypeTarget extends AbstractTarget implements SuperTypeTarget {

    private final int superTypeIndex;

    public DefaultSuperTypeTarget(final int targetType, final int superTypeIndex) {
        super(targetType);
        this.superTypeIndex = superTypeIndex;
    }

    @Override
    public int getSuperTypeIndex() {
        return superTypeIndex;
    }
}
