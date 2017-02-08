package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.LocalVar;

/**
 * @author Obicere
 */
public class DefaultLocalVar implements LocalVar {

    private final int start;
    private final int length;
    private final int index;

    public DefaultLocalVar(final int start, final int length, final int index) {
        this.start = start;
        this.length = length;
        this.index = index;
    }

    @Override
    public int getStartPC() {
        return start;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getIndex() {
        return index;
    }

}
