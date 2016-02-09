package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class dload extends Instruction {

    public static final String IDENTIFIER = "dload";
    private static final int    OPCODE   = 0x18;

    private final int index;

    public dload(final int index) {
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
