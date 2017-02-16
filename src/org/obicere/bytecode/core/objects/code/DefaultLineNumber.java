package org.obicere.bytecode.core.objects.code;

import org.javacore.code.LineNumber;

/**
 * @author Obicere
 */
public class DefaultLineNumber implements LineNumber {

    private int startPC;

    private final int lineNumber;

    public DefaultLineNumber(final int startPC, final int lineNumber) {
        this.startPC = startPC;
        this.lineNumber = lineNumber;
    }

    @Override
    public int getStartPC() {
        return startPC;
    }

    @Override
    public void setStartPC(final int startPC) {
        if(startPC < 0) {
            throw new IllegalArgumentException("pc value must be non-negative.");
        }
        this.startPC = startPC;
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }

}
