package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class nop extends Instruction {

    public static final String IDENTIFIER = "nop";

    public static final nop INSTANCE = new nop();

    private nop() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_NOP;
    }
}
