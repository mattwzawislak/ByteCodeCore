package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lload_1 extends Instruction {

    public static final String IDENTIFIER = "lload_1";

    public static final lload_1 INSTANCE = new lload_1();

    private lload_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LLOAD_1;
    }
}
