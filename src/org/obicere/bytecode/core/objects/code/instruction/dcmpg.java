package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dcmpg extends Instruction {

    public static final String IDENTIFIER = "dcmpg";

    public static final dcmpg INSTANCE = new dcmpg();

    private dcmpg() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DCMPG;
    }
}
