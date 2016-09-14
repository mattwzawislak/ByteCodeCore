package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class sipush extends Instruction {

    public static final String IDENTIFIER = "sipush";

    private final short value;

    public sipush(final short value) {
        this.value = value;
    }

    public short getValue() {
        return value;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_SIPUSH;
    }
}
