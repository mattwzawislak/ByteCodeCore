package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class CodeException extends ByteCodeElement {

    public static final String IDENTIFIER = "CodeException";

    private final int startPC;
    private final int endPC;
    private final int handlerPC;
    private final int catchType;

    public CodeException(final int startPC, final int endPC, final int handlerPC, final int catchType) {
        this.startPC = startPC;
        this.endPC = endPC;
        this.handlerPC = handlerPC;
        this.catchType = catchType;
    }

    public int getStartPC() {
        return startPC;
    }

    public int getHandlerPC() {
        return handlerPC;
    }

    public int getEndPC() {
        return endPC;
    }

    public int getCatchType() {
        return catchType;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
