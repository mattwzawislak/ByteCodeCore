package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lload_3 extends Instruction {

    public static final String IDENTIFIER = "lload_3";

    public static final lload_3 INSTANCE = new lload_3();

    private lload_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LLOAD_3;
    }
}
