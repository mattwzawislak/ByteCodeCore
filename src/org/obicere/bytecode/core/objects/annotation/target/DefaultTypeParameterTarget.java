package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.TypeParameterTarget;

/**
 * @author Obicere
 */
public class DefaultTypeParameterTarget extends AbstractTarget implements TypeParameterTarget {

    private final int typeParameterIndex;

    public DefaultTypeParameterTarget(final int targetType, final int typeParameterIndex) {
        super(targetType);
        this.typeParameterIndex = typeParameterIndex;
    }

    @Override
    public int getTypeParameterIndex() {
        return typeParameterIndex;
    }
}
