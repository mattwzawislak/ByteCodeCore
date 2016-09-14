package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class astore_2 extends Instruction {

    public static final String IDENTIFIER = "astore_2";

    public static final astore_2 INSTANCE = new astore_2();

    private astore_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ASTORE_2;
    }
}
