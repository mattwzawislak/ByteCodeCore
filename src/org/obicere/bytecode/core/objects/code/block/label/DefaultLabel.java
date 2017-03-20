package org.obicere.bytecode.core.objects.code.block.label;

import org.javacore.code.Code;
import org.javacore.code.block.label.Label;

/**
 */
public class DefaultLabel implements Label {

    protected Code code;

    private int address;

    public DefaultLabel(final Code code) {
        this(code, 0);
    }

    public DefaultLabel(final Code code, final int address) {
        if (code == null) {
            throw new NullPointerException("code must be non-null.");
        }
        if (address < 0) {
            throw new IllegalArgumentException("address must be non-negative");
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
        // fix
        return "L" + Integer.toHexString(hashCode());
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
        this.address = address;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 37 + code.hashCode();
        result = result * 37 + address;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Label) {
            final Label label = (Label) obj;

            return label.getCode() == getCode() && label.getAddress() == getAddress();
        }
        return false;
    }
}
