package org.obicere.bytecode.core.objects.code.table;

import org.javacore.code.Code;
import org.javacore.code.block.CodeBlock;
import org.javacore.code.table.CodeBlockTable;
import org.obicere.bytecode.core.objects.code.block.DefaultImplicitCodeBlock;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 */
public class DefaultCodeBlockTable implements CodeBlockTable {

    private boolean implicit;

    private final TreeMap<Integer, CodeBlock> blockMap;

    public DefaultCodeBlockTable(final Code code, final CodeBlock[] blocks) {
        this.blockMap = new TreeMap<>();

        for (final CodeBlock block : blocks) {
            if (block == null) {
                continue;
            }
            final int pc = block.getStartPC();
            blockMap.put(pc, block);
        }

        if (blocks.length == 0) {
            blockMap.put(0, new DefaultImplicitCodeBlock(code));

            this.implicit = true;
        }
    }

    public boolean isImplicit() {
        return implicit;
    }

    public CodeBlock getCodeBlockAt(final int index) {
        final Map.Entry<Integer, CodeBlock> block = blockMap.floorEntry(index);
        if (block == null) {
            return null;
        }
        return block.getValue();
    }

    @Override
    public CodeBlock[] getCodeBlocks() {
        final Collection<CodeBlock> blocks = blockMap.values();
        return blocks.toArray(new CodeBlock[blocks.size()]);
    }
}
