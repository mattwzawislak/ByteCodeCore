package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class istore_2 extends Instruction {

    public static final String IDENTIFIER = "istore_2";

    public static final istore_2 INSTANCE = new istore_2();

    private istore_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISTORE_2;
    }
}
