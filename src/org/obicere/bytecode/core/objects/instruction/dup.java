package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dup extends Instruction {

    public static final String IDENTIFIER = "dup";

    public static final dup INSTANCE = new dup();

    private dup() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DUP;
    }
}
