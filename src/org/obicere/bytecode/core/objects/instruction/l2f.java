package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class l2f extends Instruction {

    public static final String IDENTIFIER = "l2f";

    public static final l2f INSTANCE = new l2f();

    private l2f() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_L2F;
    }
}
