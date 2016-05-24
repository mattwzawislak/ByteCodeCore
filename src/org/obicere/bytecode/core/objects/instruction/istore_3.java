package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class istore_3 extends Instruction {

    public static final String IDENTIFIER = "istore_3";

    public static final istore_3 INSTANCE = new istore_3();

    private istore_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISTORE_3;
    }
}
