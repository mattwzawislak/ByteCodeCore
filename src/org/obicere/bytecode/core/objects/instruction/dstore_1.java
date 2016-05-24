package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dstore_1 extends Instruction {

    public static final String IDENTIFIER = "dstore_1";

    public static final dstore_1 INSTANCE = new dstore_1();

    private dstore_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DSTORE_1;
    }
}
