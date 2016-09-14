package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class f2l extends Instruction {

    public static final String IDENTIFIER = "f2l";

    public static final f2l INSTANCE = new f2l();

    private f2l() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_F2L;
    }
}
