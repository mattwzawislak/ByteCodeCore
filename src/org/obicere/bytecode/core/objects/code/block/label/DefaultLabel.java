package org.obicere.bytecode.core.objects.code.block.label;

import org.javacore.code.Code;
import org.javacore.code.block.label.Label;

/**
 */
public class DefaultLabel implements Label {

    protected Code code;

    protected int offset;

    private String name;

    public DefaultLabel(final Code code) {
        this(code, 0);
    }

    public DefaultLabel(final Code code, final int offset) {
        if (code == null) {
            throw new NullPointerException("code must be non-null.");
        }
        if (offset < 0) {
            throw new IllegalArgumentException("label offset must be non-negative.");
        }
        this.code = code;
        this.offset = offset;
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
        return String.valueOf(offset);
    }

    @Override
    public Code getCode() {
        return code;
    }

    @Override
    public int getOffset() {
        return offset;
    }

    protected void setOffset(final int offset) {
        if (offset < 0) {
            throw new IllegalArgumentException("offset must be non-negative");
        }
        this.offset = offset;
    }
}
