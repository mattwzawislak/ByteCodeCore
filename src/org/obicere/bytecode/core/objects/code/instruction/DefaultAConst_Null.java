package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AConst_Null;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultAConst_Null extends AbstractInstruction implements AConst_Null {

    public static final String MNEMONIC = "aconst_null";

    public static final AConst_Null INSTANCE = new DefaultAConst_Null();

    private DefaultAConst_Null() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ACONST_NULL;
    }
}
