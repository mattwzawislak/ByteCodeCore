package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dup_x1 extends Instruction {

    public static final String IDENTIFIER = "dup_x1";

    public static final dup_x1 INSTANCE = new dup_x1();

    private dup_x1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DUP_X1;
    }
}
