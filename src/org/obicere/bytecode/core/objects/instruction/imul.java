package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class imul extends Instruction {

    public static final String IDENTIFIER = "imul";

    public static final imul INSTANCE = new imul();

    private imul() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_IMUL;
    }
}
