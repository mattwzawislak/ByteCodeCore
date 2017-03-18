package org.obicere.bytecode.core.objects.code.block.label;

import org.javacore.code.Code;
import org.javacore.code.block.label.Label;

/**
 */
public class DefaultLabel implements Label {

    protected Code code;

    protected int address;

    public DefaultLabel(final Code code) {
        this(code, 0);
    }

    public DefaultLabel(final Code code, final int address) {
        if (code == null) {
            throw new NullPointerException("code must be non-null.");
        }
        if (address < 0) {
            throw new IllegalArgumentException("label address must be non-negative.");
        }
        this.code = code;
        this.address = address;
    }

    @Override
    public String getName() {
        /*
        final CodeBlock codeBlock = code.getCodeBlockTable().getCodeBlock(offset);
        final int offsetFromBlock = offset - codeBlock.getStartPC();
        if (offsetFromBlock == 0) {
            name = code.getName();
        } else {
            name = code.getName() + "+" + offsetFromBlock;
        }*/
        return String.valueOf(address);
    }

    @Override
    public Code getCode() {
        return code;
    }

    @Override
    public int getAddress() {
        return address;
    }

    @Override
    public void setAddress(final int address) {
        if (address < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        this.address = address;
    }
}
