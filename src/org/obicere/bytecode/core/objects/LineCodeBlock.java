package org.obicere.bytecode.core.objects;

/**
 */

public class LineCodeBlock extends CodeBlock {

    public static final String IDENTIFIER = "LineCodeBlock";

    private final LineNumber line;

    public LineCodeBlock(final LineNumber line) {
        this.line = line;
    }

    @Override
    public int getStartPC() {
        return line.getStartPC();
    }

    @Override
    public String getName() {
        return "L" + line.getLineNumber();
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
