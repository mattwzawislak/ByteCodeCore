package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.Target;

/**
 * @author Obicere
 */
public abstract class AbstractTarget implements Target {

    private int type;

    public AbstractTarget(final int type) {
        this.type = type;
    }

    @Override
    public int getType() {
        return type;
    }

}
