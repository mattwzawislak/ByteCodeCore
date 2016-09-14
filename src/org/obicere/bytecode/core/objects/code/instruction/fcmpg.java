package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fcmpg extends Instruction {

    public static final String IDENTIFIER = "fcmpg";

    public static final fcmpg INSTANCE = new fcmpg();

    private fcmpg() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FCMPG;
    }
}
