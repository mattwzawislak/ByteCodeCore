package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class monitorenter extends Instruction {

    public static final String IDENTIFIER = "monitorenter";

    public static final monitorenter INSTANCE = new monitorenter();

    private monitorenter() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_MONITORENTER;
    }
}
