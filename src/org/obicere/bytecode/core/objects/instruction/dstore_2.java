package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dstore_2 extends Instruction {

    public static final String IDENTIFIER = "dstore_2";

    public static final dstore_2 INSTANCE = new dstore_2();

    private dstore_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DSTORE_2;
    }
}
