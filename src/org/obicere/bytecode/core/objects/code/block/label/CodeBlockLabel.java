package org.obicere.bytecode.core.objects.code.block.label;

import org.obicere.bytecode.core.objects.code.block.CodeBlock;

/**
 * @author Obicere
 */
public class CodeBlockLabel implements Label {

    public static final String IDENTIFIER = "CodeBlockLabel";

    private final CodeBlock block;

    private int offset;

    public CodeBlockLabel(final int offset) {
        this(null, offset);
    }

    public CodeBlockLabel(final CodeBlock block, final int offset) {
        if (offset < 0) {
            throw new IllegalArgumentException("offset must be non-negative.");
        }
        this.block = block;
        this.offset = offset;
    }

    public CodeBlock getCodeBlock() {
        return block;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public int computeOffset(final LabelFactory factory) {
        if (block == null) {
            return offset;
        }
        return factory.getIndexOf(block) + offset;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
