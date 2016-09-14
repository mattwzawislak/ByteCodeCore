package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class aload_2 extends Instruction {

    public static final String IDENTIFIER = "aload_2";

    public static final aload_2 INSTANCE = new aload_2();

    private aload_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ALOAD_2;
    }

}
