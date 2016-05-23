package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.objects.label.LabelFactory;
import org.obicere.bytecode.core.objects.label.LazyLabel;

/**
 * @author Obicere
 */
public class CodeException implements Identifiable {

    public static final String IDENTIFIER = "CodeException";

    private final LazyLabel start;
    private final LazyLabel end;
    private final LazyLabel handler;
    private final int catchType;

    public CodeException(final LazyLabel start, final LazyLabel end, final LazyLabel handler, final int catchType) {
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

    public int getCatchType() {
        return catchType;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
