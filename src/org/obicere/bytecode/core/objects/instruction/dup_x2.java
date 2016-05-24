package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dup_x2 extends Instruction {

    public static final String IDENTIFIER = "dup_x2";

    public static final dup_x2 INSTANCE = new dup_x2();

    private dup_x2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DUP_X2;
    }
}
