package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lload_0 extends Instruction {

    public static final String IDENTIFIER = "lload_0";

    public static final lload_0 INSTANCE = new lload_0();

    private lload_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LLOAD_0;
    }
}
