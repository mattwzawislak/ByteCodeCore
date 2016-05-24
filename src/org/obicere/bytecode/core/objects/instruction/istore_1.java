package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class istore_1 extends Instruction {

    public static final String IDENTIFIER = "istore_1";

    public static final istore_1 INSTANCE = new istore_1();

    private istore_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISTORE_1;
    }
}
