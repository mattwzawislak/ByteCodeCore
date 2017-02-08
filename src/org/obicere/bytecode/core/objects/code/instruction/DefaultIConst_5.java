package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IConst_5;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIConst_5 extends AbstractInstruction implements IConst_5 {

    public static final String MNEMONIC = "iconst_5";

    public static final IConst_5 INSTANCE = new DefaultIConst_5();

    private DefaultIConst_5() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ICONST_5;
    }
}
