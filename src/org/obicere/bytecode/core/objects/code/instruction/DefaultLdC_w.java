package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LdC_w;
import org.javacore.constant.Constant;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLdC_w extends AbstractInstruction implements LdC_w {

    public static final String MNEMONIC = "ldc_w";

    private final Constant constant;

    public DefaultLdC_w(final Constant constant) {
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
        return InstructionReader.OPCODE_LDC_W;
    }
}
