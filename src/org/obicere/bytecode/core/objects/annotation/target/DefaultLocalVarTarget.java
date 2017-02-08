package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.LocalVar;
import org.javacore.annotation.target.LocalVarTarget;

/**
 * @author Obicere
 */
public class DefaultLocalVarTarget extends AbstractTarget implements LocalVarTarget {

    private final LocalVar[] table;

    public DefaultLocalVarTarget(final int targetType, final LocalVar[] table) {
        super(targetType);
        this.table = table;
    }

    @Override
    public LocalVar[] getTable() {
        return table;
    }
}
