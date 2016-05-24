package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lstore_3 extends Instruction {

    public static final String IDENTIFIER = "lstore_3";

    public static final lstore_3 INSTANCE = new lstore_3();

    private lstore_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSTORE_3;
    }
}
