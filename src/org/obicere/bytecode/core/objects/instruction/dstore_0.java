package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dstore_0 extends Instruction {

    public static final String IDENTIFIER = "dstore_0";

    public static final dstore_0 INSTANCE = new dstore_0();

    private dstore_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DSTORE_0;
    }
}
