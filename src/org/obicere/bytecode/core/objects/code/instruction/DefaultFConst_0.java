package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FConst_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFConst_0 extends AbstractInstruction implements FConst_0 {

    public static final String MNEMONIC = "fconst_0";

    public static final FConst_0 INSTANCE = new DefaultFConst_0();

    private DefaultFConst_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FCONST_0;
    }
}
