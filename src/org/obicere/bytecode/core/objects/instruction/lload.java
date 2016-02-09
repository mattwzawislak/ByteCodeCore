package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class lload extends Instruction {

    public static final String IDENTIFIER = "lload";
    private static final int    OPCODE   = 0x16;

    private final int index;

    public lload(final int index) {
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
