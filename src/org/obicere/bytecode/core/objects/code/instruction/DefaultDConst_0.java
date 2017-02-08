package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DConst_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDConst_0 extends AbstractInstruction implements DConst_0 {

    public static final String MNEMONIC = "dconst_0";

    public static final DConst_0 INSTANCE = new DefaultDConst_0();

    private DefaultDConst_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DCONST_0;
    }
}
