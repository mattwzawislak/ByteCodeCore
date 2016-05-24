package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class aload_1 extends Instruction {

    public static final String IDENTIFIER = "aload_1";

    public static final aload_1 INSTANCE = new aload_1();

    private aload_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ALOAD_1;
    }
}
