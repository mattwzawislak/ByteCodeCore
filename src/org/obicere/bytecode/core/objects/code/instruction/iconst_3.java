package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_3 extends Instruction {

    public static final String IDENTIFIER = "iconst_3";

    public static final iconst_3 INSTANCE = new iconst_3();

    private iconst_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_3;
    }
}
