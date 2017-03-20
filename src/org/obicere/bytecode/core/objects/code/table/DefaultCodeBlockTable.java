package org.obicere.bytecode.core.objects.code.table;

import org.javacore.code.block.CodeBlock;
import org.javacore.code.table.CodeBlockTable;

/**
 */
public class DefaultCodeBlockTable implements CodeBlockTable {

    private final CodeBlock[] codeBlocks;

    public DefaultCodeBlockTable(final CodeBlock[] codeBlocks) {
        this.codeBlocks = codeBlocks;
    }

    @Override
    public CodeBlock getCodeBlock(final int pc) {
        for (final CodeBlock block : codeBlocks) {
            if (block != null && block.getAddress().getAddress() == pc) {
                return block;
            }
        }
        return null;
    }

    @Override
    public CodeBlock[] getCodeBlocks() {
        return codeBlocks.clone();
    }
}
