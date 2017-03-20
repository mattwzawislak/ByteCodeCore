package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.block.CodeBlock;
import org.javacore.code.block.label.Label;

/**
 * @author Obicere
 */
public abstract class AbstractCodeBlock implements CodeBlock {

    protected Label address;

    public AbstractCodeBlock(final Label address) {
        this.address = address;
    }

    @Override
    public Label getAddress() {
        return address;
    }

    @Override
    public void setAddress(final Label address) {
        this.address = address;
    }
}
