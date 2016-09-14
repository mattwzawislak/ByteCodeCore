package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class bipush extends Instruction {

    public static final String IDENTIFIER = "bipush";

    private final byte value;

    public bipush(final byte value) {
        this.value = value;
    }

    public byte getByte() {
        return value;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_BIPUSH;
    }
}
