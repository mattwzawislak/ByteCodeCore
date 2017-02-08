package org.obicere.bytecode.core.objects.code.block.label;

import org.javacore.code.block.CodeBlock;
import org.javacore.code.block.label.Label;

/**
 */
public class DefaultLabel implements Label {

    private CodeBlock block;

    private int offset;

    public DefaultLabel(final CodeBlock block, final int offset) {
        this.block = block;
        this.offset = offset;
    }

    @Override
    public CodeBlock getBlock() {
        return block;
    }

    @Override
    public void setCodeBlock(final CodeBlock block) {
        this.block = block;
    }

    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public void setOffset(final int offset) {
        this.offset = offset;
    }
}
