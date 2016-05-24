package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class aastore extends Instruction {

    public static final  String IDENTIFIER = "aastore";

    public static final aastore INSTANCE = new aastore();

    private aastore() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_AASTORE;
    }
}
