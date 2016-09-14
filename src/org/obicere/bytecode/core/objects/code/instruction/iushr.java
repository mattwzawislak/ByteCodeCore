package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
