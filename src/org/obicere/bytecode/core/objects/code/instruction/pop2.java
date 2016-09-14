package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class pop2 extends Instruction {

    public static final String IDENTIFIER = "pop2";

    public static final pop2 INSTANCE = new pop2();

    private pop2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_POP2;
    }
}
