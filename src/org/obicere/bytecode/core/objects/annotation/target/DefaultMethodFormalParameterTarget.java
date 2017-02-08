package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.MethodFormalParameterTarget;

/**
 * @author Obicere
 */
public class DefaultMethodFormalParameterTarget extends AbstractTarget implements MethodFormalParameterTarget {

    private final int formalParameterIndex;

    public DefaultMethodFormalParameterTarget(final int targetType, final int formalParameterIndex) {
        super(targetType);
        this.formalParameterIndex = formalParameterIndex;
    }

    @Override
    public int getFormalParameterIndex() {
        return formalParameterIndex;
    }
}
