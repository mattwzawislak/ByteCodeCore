package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dload_2 extends Instruction {

    public static final String IDENTIFIER = "dload_2";

    public static final dload_2 INSTANCE = new dload_2();

    private dload_2() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DLOAD_2;
    }
}
