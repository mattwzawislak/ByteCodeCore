package org.obicere.bytecode.core.objects.code.table;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.block.label.LabelFactory;
import org.obicere.bytecode.core.objects.code.block.label.LazyLabel;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class LocalVariable implements Identifiable {

    public static final String IDENTIFIER = "LocalVariable";

    private final LazyLabel start;
    private final LazyLabel end;
    private final String    name;
    private final Type      type;
    private final int       index;

    public LocalVariable(final LazyLabel start, final LazyLabel end, final String name, final Type type, final int index) {
        this.start = start;
        this.end = end;
        this.name = name;
        this.type = type;
        this.index = index;
    }

    public void initializeLabels(final LabelFactory factory) {
        start.initialize(factory);
        end.initialize(factory);
    }

    public Label getStart() {
        return start;
    }

    public Label getEnd() {
        return end;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
