package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class iinc extends Instruction {

    public static final String IDENTIFIER = "iinc";
    private static final int    OPCODE   = 0x84;

    private final int index;
    private final int constant;

    public iinc(final int index, final int constant) {
        super(IDENTIFIER, OPCODE);
        this.index = index;
        this.constant = constant;
    }

    public int getIndex() {
        return index;
    }

    public int getConstant() {
        return constant;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        super.model(builder);
        builder.tab();
        builder.add(index);
        builder.tab();
        builder.add(constant);
    }
}
