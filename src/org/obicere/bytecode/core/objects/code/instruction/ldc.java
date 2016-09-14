package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.constant.Constant;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ldc extends Instruction {

    public static final String IDENTIFIER = "ldc";

    private final Constant constant;

    public ldc(final Constant constant) {
        this.constant = constant;
    }

    public Constant getConstant() {
        return constant;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LDC;
    }
}
