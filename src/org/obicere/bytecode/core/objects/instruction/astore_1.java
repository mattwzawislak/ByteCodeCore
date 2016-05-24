package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class astore_1 extends Instruction {

    public static final String IDENTIFIER = "astore_1";

    public static final astore_1 INSTANCE = new astore_1();

    private astore_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ASTORE_1;
    }
}
