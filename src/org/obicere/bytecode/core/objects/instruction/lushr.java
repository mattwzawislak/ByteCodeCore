package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lushr extends Instruction {

    public static final String IDENTIFIER = "lushr";

    public static final lushr INSTANCE = new lushr();

    private lushr() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LUSHR;
    }
}
