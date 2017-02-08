package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.Code;
import org.javacore.code.block.ImplicitCodeBlock;

/**
 * @author Obicere
 */
public class DefaultImplicitCodeBlock extends AbstractCodeBlock implements ImplicitCodeBlock {

    public DefaultImplicitCodeBlock(final Code code) {
        super(code);
    }

    @Override
    public int getStartPC() {
        return 0;
    }

    @Override
    public void setStartPC(final int pc) {
        throw new UnsupportedOperationException("cannot modify start pc of implicit code block");
    }

    @Override
    public String getName() {
        return "";
    }
}
