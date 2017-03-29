package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LdC2_w;
import org.javacore.constant.Constant;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLdC2_w extends AbstractInstruction implements LdC2_w {

    public static final String MNEMONIC = "lcd2_w";

    private final Constant constant;

    public DefaultLdC2_w(final Constant constant) {
        this.constant = constant;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Constant getConstant() {
        return constant;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LDC2_W;
    }
}
