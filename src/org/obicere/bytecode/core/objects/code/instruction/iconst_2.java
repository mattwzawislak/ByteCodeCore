package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_2 extends Instruction {

    public static final String IDENTIFIER = "iconst_2";

    public static final iconst_2 INSTANCE = new iconst_2();

    private iconst_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_2;
    }
}
