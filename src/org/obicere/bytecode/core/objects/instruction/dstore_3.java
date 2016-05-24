package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dstore_3 extends Instruction {

    public static final String IDENTIFIER = "dstore_3";

    public static final dstore_3 INSTANCE = new dstore_3();

    private dstore_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DSTORE_3;
    }
}
