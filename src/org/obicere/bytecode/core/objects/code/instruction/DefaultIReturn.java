package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IReturn;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIReturn extends AbstractInstruction implements IReturn {

    public static final String MNEMONIC = "ireturn";

    public static final IReturn INSTANCE = new DefaultIReturn();

    private DefaultIReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IRETURN;
    }
}
