package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class astore_3 extends Instruction {

    public static final String IDENTIFIER = "astore_3";

    public static final astore_3 INSTANCE = new astore_3();

    private astore_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ASTORE_3;
    }
}
