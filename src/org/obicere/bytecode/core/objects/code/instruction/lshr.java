package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lshr extends Instruction {

    public static final String IDENTIFIER = "lshr";

    public static final lshr INSTANCE = new lshr();

    private lshr() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSHR;
    }
}
