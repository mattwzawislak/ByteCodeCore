package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LdC2_w;
import org.javacore.constant.Constant;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
    public Constant getConstant() {
        return constant;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LDC2_W;
    }
}
