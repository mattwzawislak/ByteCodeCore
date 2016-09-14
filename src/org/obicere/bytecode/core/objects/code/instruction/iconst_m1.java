package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_m1 extends Instruction {

    public static final String IDENTIFIER = "iconst_m1";

    public static final iconst_m1 INSTANCE = new iconst_m1();

    private iconst_m1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_M1;
    }
}
