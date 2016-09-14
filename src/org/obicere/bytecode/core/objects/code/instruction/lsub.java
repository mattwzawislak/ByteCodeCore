package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lsub extends Instruction {

    public static final String IDENTIFIER = "lsub";

    public static final lsub INSTANCE = new lsub();

    private lsub() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSUB;
    }
}
