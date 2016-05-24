package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_5 extends Instruction {

    public static final String IDENTIFIER = "iconst_5";

    public static final iconst_5 INSTANCE = new iconst_5();

    private iconst_5() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_5;
    }
}
