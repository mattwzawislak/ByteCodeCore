package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class baload extends Instruction {

    public static final String IDENTIFIER = "baload";

    public static final baload INSTANCE = new baload();

    private baload() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_BALOAD;
    }
}
