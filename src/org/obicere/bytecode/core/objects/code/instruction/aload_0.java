package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class aload_0 extends Instruction {

    public static final  String IDENTIFIER = "aload_0";

    public static final aload_0 INSTANCE = new aload_0();

    private aload_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ALOAD_0;
    }
}
