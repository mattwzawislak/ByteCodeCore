package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iload_3 extends Instruction {

    public static final String IDENTIFIER = "iload_3";

    public static final iload_3 INSTANCE = new iload_3();

    private iload_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ILOAD_3;
    }
}
