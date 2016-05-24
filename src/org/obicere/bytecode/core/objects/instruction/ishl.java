package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ishl extends Instruction {

    public static final String IDENTIFIER = "ishl";

    public static final ishl INSTANCE = new ishl();

    private ishl() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISHL;
    }
}
