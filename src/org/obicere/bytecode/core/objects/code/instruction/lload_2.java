package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lload_2 extends Instruction {

    public static final String IDENTIFIER = "lload_2";

    public static final lload_2 INSTANCE = new lload_2();

    private lload_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LLOAD_2;
    }
}
