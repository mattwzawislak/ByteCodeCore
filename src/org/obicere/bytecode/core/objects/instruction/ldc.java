package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class ldc extends Instruction {

    public static final String IDENTIFIER = "ldc";
    private static final int    OPCODE   = 0x12;

    private final int index;

    public ldc(final int index) {
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
        builder.getConstantPool().get(index).modelValue(builder);
    }
}
