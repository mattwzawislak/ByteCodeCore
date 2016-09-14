package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class dload_0 extends Instruction {

    public static final String IDENTIFIER = "dload_0";

    public static final dload_0 INSTANCE = new dload_0();

    private dload_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_DLOAD_0;
    }
}
