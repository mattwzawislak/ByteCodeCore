package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class istore extends Instruction {

    public static final String IDENTIFIER = "istore";

    private final int index;

    public istore(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISTORE;
    }
}
