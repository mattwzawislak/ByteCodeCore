package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class istore_0 extends Instruction {

    public static final String IDENTIFIER = "istore_0";

    public static final istore_0 INSTANCE = new istore_0();

    private istore_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ISTORE_0;
    }
}
