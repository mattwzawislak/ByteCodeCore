package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.TypeParameterBoundTarget;

/**
 * @author Obicere
 */
public class DefaultTypeParameterBoundTarget extends AbstractTarget implements TypeParameterBoundTarget {

    private final int typeParameterIndex;

    private final int boundIndex;

    public DefaultTypeParameterBoundTarget(final int targetType, final int typeParameterIndex, final int boundIndex) {
        super(targetType);
        this.typeParameterIndex = typeParameterIndex;
        this.boundIndex = boundIndex;
    }

    @Override
    public int getTypeParameterIndex() {
        return typeParameterIndex;
    }

    @Override
    public int getBoundIndex() {
        return boundIndex;
    }
}
