package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class d2l extends Instruction {

    public static final String IDENTIFIER = "d2l";

    public static final d2l INSTANCE = new d2l();

    private d2l() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_D2L;
    }
}
