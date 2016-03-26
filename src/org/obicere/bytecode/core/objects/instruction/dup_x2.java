package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dup_x2 extends Instruction {

    public static final String IDENTIFIER = "dup_x2";
    private static final int    OPCODE   = 0x5b;

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DUP_X2;
    }
}
