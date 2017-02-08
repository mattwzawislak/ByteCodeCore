package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IConst_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIConst_0 extends AbstractInstruction implements IConst_0 {

    public static final String MNEMONIC = "iconst_0";

    public static final IConst_0 INSTANCE = new DefaultIConst_0();

    private DefaultIConst_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ICONST_0;
    }
}
