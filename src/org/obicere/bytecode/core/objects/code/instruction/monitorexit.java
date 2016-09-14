package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class monitorexit extends Instruction {

    public static final String IDENTIFIER = "monitorexit";

    public static final monitorexit INSTANCE = new monitorexit();

    private monitorexit() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_MONITOREXIT;
    }
}
