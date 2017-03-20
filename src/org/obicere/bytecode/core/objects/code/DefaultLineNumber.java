package org.obicere.bytecode.core.objects.code;

import org.javacore.code.LineNumber;
import org.javacore.code.block.label.Label;

/**
 * @author Obicere
 */
public class DefaultLineNumber implements LineNumber {

    private Label address;

    private final int lineNumber;

    public DefaultLineNumber(final Label address, final int lineNumber) {
        this.address = address;
        this.lineNumber = lineNumber;
    }

    @Override
    public Label getAddress() {
        return address;
    }

    @Override
    public void setAddress(final Label address) {
        if (address == null) {
            throw new NullPointerException("address must be non-null");
        }
        this.address = address;
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}
