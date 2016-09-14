package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class arraylength extends Instruction {

    public static final String IDENTIFIER = "arraylength";

    public static final arraylength INSTANCE = new arraylength();

    private arraylength() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ARRAYLENGTH;
    }
}
