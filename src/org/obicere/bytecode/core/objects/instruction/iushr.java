package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class iushr extends Instruction {

    public static final String IDENTIFIER = "iushr";

    public static final iushr INSTANCE = new iushr();

    private iushr() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_IUSHR;
    }
}
