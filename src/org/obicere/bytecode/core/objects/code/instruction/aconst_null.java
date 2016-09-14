package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class aconst_null extends Instruction {

    public static final  String IDENTIFIER = "aconst_null";

    public static final aconst_null INSTANCE = new aconst_null();

    private aconst_null() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ACONST_NULL;
    }
}
