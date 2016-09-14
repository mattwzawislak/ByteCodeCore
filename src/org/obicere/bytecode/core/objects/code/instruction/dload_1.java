package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dload_1 extends Instruction {

    public static final String IDENTIFIER = "dload_1";

    public static final dload_1 INSTANCE = new dload_1();

    private dload_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DLOAD_1;
    }
}
