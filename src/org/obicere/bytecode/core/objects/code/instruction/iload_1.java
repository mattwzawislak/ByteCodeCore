package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iload_1 extends Instruction {

    public static final String IDENTIFIER = "iload_1";

    public static final iload_1 INSTANCE = new iload_1();

    private iload_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ILOAD_1;
    }
}
