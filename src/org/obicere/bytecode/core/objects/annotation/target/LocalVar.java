package org.obicere.bytecode.core.objects.annotation.target;

import org.obicere.bytecode.core.objects.code.block.label.Label;

/**
 * @author Obicere
 */
public class LocalVar {

    private final Label start;
    private final Label end;
    private final int   index;

    public LocalVar(final Label start, final Label end, final int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }

    public Label getStart(){
        return start;
    }

    public Label getEnd(){
        return end;
    }

    public int getIndex(){
        return index;
    }

}
