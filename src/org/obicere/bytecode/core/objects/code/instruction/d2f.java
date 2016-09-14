package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class d2f extends Instruction {

    public static final String IDENTIFIER = "d2f";

    public static final d2f INSTANCE = new d2f();

    private d2f() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_D2F;
    }
}
