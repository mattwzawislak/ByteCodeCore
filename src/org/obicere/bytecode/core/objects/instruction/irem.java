package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class irem extends Instruction {

    public static final String IDENTIFIER = "irem";

    public static final irem INSTANCE = new irem();

    private irem() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_IREM;
    }
}
