package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dload_3 extends Instruction {

    public static final String IDENTIFIER = "dload_3";

    public static final dload_3 INSTANCE = new dload_3();

    private dload_3() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DLOAD_3;
    }
}
