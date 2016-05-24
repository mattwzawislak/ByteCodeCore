package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class sastore extends Instruction {

    public static final String IDENTIFIER = "sastore";

    public static final sastore INSTANCE = new sastore();

    private sastore() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_SASTORE;
    }
}
