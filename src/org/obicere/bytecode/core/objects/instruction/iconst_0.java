package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_0 extends Instruction {

    public static final String IDENTIFIER = "iconst_0";

    public static final iconst_0 INSTANCE = new iconst_0();

    private iconst_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_0;
    }
}
