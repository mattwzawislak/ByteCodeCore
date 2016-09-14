package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class f2i extends Instruction {

    public static final String IDENTIFIER = "f2i";

    public static final f2i INSTANCE = new f2i();

    private f2i() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_F2I;
    }
}
