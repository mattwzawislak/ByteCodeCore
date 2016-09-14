package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iconst_4 extends Instruction {

    public static final String IDENTIFIER = "iconst_4";

    public static final iconst_4 INSTANCE = new iconst_4();

    private iconst_4() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ICONST_4;
    }
}
