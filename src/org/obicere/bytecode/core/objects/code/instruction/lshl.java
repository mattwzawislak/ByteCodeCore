package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
