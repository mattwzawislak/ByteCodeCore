package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_1 extends Instruction {

    public static final String IDENTIFIER = "iconst_1";

    public static final iconst_1 INSTANCE = new iconst_1();

    private iconst_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_1;
    }
}
