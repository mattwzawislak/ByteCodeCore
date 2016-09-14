package org.obicere.bytecode.core.objects.code.table;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.objects.code.block.label.LabelFactory;
import org.obicere.bytecode.core.objects.code.block.label.LazyLabel;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class CodeException implements Identifiable {

    public static final String IDENTIFIER = "CodeException";

    private final LazyLabel start;
    private final LazyLabel end;
    private final LazyLabel handler;
    private final Type      catchType;

    public CodeException(final LazyLabel start, final LazyLabel end, final LazyLabel handler, final Type catchType) {
        this.start = start;
        this.end = end;
        this.handler = handler;
        this.catchType = catchType;
    }

    public void initializeLabels(final LabelFactory factory) {
        start.initialize(factory);
        end.initialize(factory);
        handler.initialize(factory);
    }

    public Label getStart() {
        return start;
    }

    public Label getEnd() {
        return end;
    }

    public Label getHandler() {
        return handler;
    }

    public Type getCatchType() {
        return catchType;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
