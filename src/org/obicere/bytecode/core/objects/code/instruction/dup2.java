package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dup2 extends Instruction {

    public static final String IDENTIFIER = "dup2";

    public static final dup2 INSTANCE = new dup2();

    private dup2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DUP2;
    }
}
