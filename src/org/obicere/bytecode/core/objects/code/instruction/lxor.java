package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lxor extends Instruction {

    public static final String IDENTIFIER = "lxor";

    public static final lxor INSTANCE = new lxor();

    private lxor() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LXOR;
    }
}
