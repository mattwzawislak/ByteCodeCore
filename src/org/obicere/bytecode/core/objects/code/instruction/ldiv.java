package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ldiv extends Instruction {

    public static final String IDENTIFIER = "ldiv";

    public static final ldiv INSTANCE = new ldiv();

    private ldiv() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LDIV;
    }
}
