package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IConst_4;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIConst_4 extends AbstractInstruction implements IConst_4 {

    public static final String MNEMONIC = "iconst_4";

    public static final IConst_4 INSTANCE = new DefaultIConst_4();

    private DefaultIConst_4() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ICONST_4;
    }
}
