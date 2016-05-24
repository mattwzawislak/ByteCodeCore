package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lshl extends Instruction {

    public static final String IDENTIFIER = "lshl";

    public static final lshl INSTANCE = new lshl();

    private lshl() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSHL;
    }
}
