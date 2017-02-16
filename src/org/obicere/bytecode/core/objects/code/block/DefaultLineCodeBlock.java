package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.LineNumber;
import org.javacore.code.block.LineCodeBlock;

/**
 */

public class DefaultLineCodeBlock implements LineCodeBlock {

    private final LineNumber line;

    public DefaultLineCodeBlock(final LineNumber line) {
        this.line = line;
    }

    @Override
    public String getName() {
        return "L" + line.getLineNumber();
    }

    @Override
    public int getStartPC(){
        return line.getStartPC();
    }

    @Override
    public LineNumber getLineNumber() {
        return line;
    }
}
