package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lstore_0 extends Instruction {

    public static final String IDENTIFIER = "lstore_0";

    public static final lstore_0 INSTANCE = new lstore_0();

    private lstore_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LSTORE_0;
    }
}
