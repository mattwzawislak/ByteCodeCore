package org.obicere.bytecode.core.objects.code;

import org.javacore.code.LocalVariable;
import org.javacore.code.block.label.Label;
import org.javacore.type.Type;

/**
 * @author Obicere
 */
public class DefaultLocalVariable implements LocalVariable {

    private final Label  start;
    private final Label  end;
    private final String name;
    private final Type   type;
    private final int    index;

    public DefaultLocalVariable(final Label start, final Label end, final String name, final Type type, final int index) {
        this.start = start;
        this.end = end;
        this.name = name;
        this.type = type;
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
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
