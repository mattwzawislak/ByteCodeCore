package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dup2_x2 extends Instruction {

    public static final String IDENTIFIER = "dup2_x2";

    public static final dup2_x2 INSTANCE = new dup2_x2();

    private dup2_x2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DUP2_X2;
    }
}
