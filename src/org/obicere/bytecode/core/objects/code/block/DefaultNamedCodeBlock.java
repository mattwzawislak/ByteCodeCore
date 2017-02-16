package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.block.NamedCodeBlock;

/**
 */
public class DefaultNamedCodeBlock implements NamedCodeBlock {

    private String name;

    private int startPC;

    public DefaultNamedCodeBlock(final String name, final int startPC) {
        this.name = name;
        this.startPC = startPC;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStartPC() {
        return startPC;
    }
}
