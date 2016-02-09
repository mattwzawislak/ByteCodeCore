package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class fload extends Instruction {

    public static final String IDENTIFIER = "fload";
    private static final int    OPCODE   = 0x17;

    private final int index;

    public fload(final int index) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        super.model(builder);
        builder.tab();
        builder.add(index);
    }
}
