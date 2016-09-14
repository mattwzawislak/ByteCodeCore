package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lstore_1 extends Instruction {

    public static final String IDENTIFIER = "lstore_1";

    public static final lstore_1 INSTANCE = new lstore_1();

    private lstore_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSTORE_1;
    }
}
