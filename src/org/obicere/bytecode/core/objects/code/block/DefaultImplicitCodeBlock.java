package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.block.ImplicitCodeBlock;

/**
 * @author Obicere
 */
public class DefaultImplicitCodeBlock implements ImplicitCodeBlock {

    @Override
    public int getStartPC() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
