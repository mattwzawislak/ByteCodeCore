package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.LineNumber;
import org.javacore.code.block.LineCodeBlock;

/**
 */

public class DefaultLineCodeBlock extends AbstractCodeBlock implements LineCodeBlock {

    private final LineNumber line;

    public DefaultLineCodeBlock(final LineNumber line) {
        super(line.getAddress());
        this.line = line;
    }

    @Override
    public String getName() {
        return "L" + line.getLineNumber();
    }

    @Override
    public LineNumber getLineNumber() {
        return line;
    }
}
