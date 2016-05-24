package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class fcmpl extends Instruction {

    public static final String IDENTIFIER = "fcmpl";

    public static final fcmpl INSTANCE = new fcmpl();

    private fcmpl() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_FCMPL;
    }
}
