package org.obicere.bytecode.core.objects.annotation.target;

import org.javacore.annotation.target.LocalVar;
import org.javacore.code.block.label.Label;

/**
 * @author Obicere
 */
public class DefaultLocalVar implements LocalVar {

    private final Label start;
    private final Label end;
    private final int   index;

    public DefaultLocalVar(final Label start, final Label end, final int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }

    @Override
    public Label getStart() {
        return start;
    }

    @Override
    public Label getEnd() {
        return end;
    }

    @Override
    public int getIndex() {
        return index;
    }

}
