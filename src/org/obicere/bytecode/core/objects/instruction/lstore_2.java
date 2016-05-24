package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lstore_2 extends Instruction {

    public static final String IDENTIFIER = "lstore_2";

    public static final lstore_2 INSTANCE = new lstore_2();

    private lstore_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSTORE_2;
    }
}
