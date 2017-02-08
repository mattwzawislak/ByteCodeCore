package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LConst_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLConst_1 extends AbstractInstruction implements LConst_1 {

    public static final String MNEMONIC = "lconst_1";

    public static final LConst_1 INSTANCE = new DefaultLConst_1();

    private DefaultLConst_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LCONST_1;
    }
}
