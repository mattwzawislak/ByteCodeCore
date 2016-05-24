package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class f2d extends Instruction {

    public static final String IDENTIFIER = "f2d";

    public static final f2d INSTANCE = new f2d();

    private f2d() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_F2D;
    }
}
