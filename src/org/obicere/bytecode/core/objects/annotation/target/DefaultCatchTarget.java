package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.CatchTarget;

/**
 * @author Obicere
 */
public class DefaultCatchTarget extends AbstractTarget implements CatchTarget {

    private final int exceptionTableIndex;

    public DefaultCatchTarget(final int targetType, final int exceptionTableIndex) {
        super(targetType);
        this.exceptionTableIndex = exceptionTableIndex;
    }

    @Override
    public int getExceptionTableIndex() {
        return exceptionTableIndex;
    }
}
