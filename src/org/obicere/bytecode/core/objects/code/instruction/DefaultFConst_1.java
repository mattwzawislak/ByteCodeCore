package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FConst_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFConst_1 extends AbstractInstruction implements FConst_1 {

    public static final String MNEMONIC = "fconst_1";

    public static final FConst_1 INSTANCE = new DefaultFConst_1();

    private DefaultFConst_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FCONST_1;
    }
}
