package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dsub extends Instruction {

    public static final String IDENTIFIER = "dsub";

    public static final dsub INSTANCE = new dsub();

    private dsub() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DSUB;
    }
}
