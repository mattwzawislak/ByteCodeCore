package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fstore extends Instruction {

    public static final String IDENTIFIER = "fstore";

    private final int index;

    public fstore(final int index) {
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
        return InstructionReader.OPCODE_FSTORE;
    }
}
