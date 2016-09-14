package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iload_2 extends Instruction {

    public static final String IDENTIFIER = "iload_2";

    public static final iload_2 INSTANCE = new iload_2();

    private iload_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ILOAD_2;
    }
}
