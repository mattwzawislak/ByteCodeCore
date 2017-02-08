package org.obicere.bytecode.core.objects.code;

import org.javacore.code.CodeException;
import org.javacore.code.block.label.Label;
import org.javacore.type.Type;

/**
 * @author Obicere
 */
public class DefaultCodeException implements CodeException {

    private final Label start;
    private final Label end;
    private final Label handler;
    private final Type  catchType;

    public DefaultCodeException(final Label start, final Label end, final Label handler, final Type catchType) {
        this.start = start;
        this.end = end;
        this.handler = handler;
        this.catchType = catchType;
    }

    @Override
    public Type getType() {
        return catchType;
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
    public Label getHandler() {
        return handler;
    }
}
