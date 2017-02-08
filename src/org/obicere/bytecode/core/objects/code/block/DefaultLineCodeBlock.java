package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.Code;
import org.javacore.code.block.LineCodeBlock;
import org.javacore.code.LineNumber;

/**
 */

public class DefaultLineCodeBlock extends AbstractCodeBlock implements LineCodeBlock {

    private final LineNumber line;

    public DefaultLineCodeBlock(final Code code, final LineNumber line) {
        super(code);
        this.line = line;
    }

    @Override
    public int getStartPC() {
        return line.getStartPC();
    }

    @Override
    public void setStartPC(final int pc) {
        //line.setStartPC(pc);
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
