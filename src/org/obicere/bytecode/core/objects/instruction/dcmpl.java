package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dcmpl extends Instruction {

    public static final String IDENTIFIER = "dcmpl";

    public static final dcmpl INSTANCE = new dcmpl();

    private dcmpl() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DCMPL;
    }
}
