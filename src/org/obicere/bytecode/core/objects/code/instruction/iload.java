package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iload extends Instruction {

    public static final String IDENTIFIER = "iload";

    private final int index;

    public iload(final int index) {
        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ILOAD;
    }
}
