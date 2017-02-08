package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IXor;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIXor extends AbstractInstruction implements IXor {

    public static final String MNEMONIC = "ixor";

    public static final IXor INSTANCE = new DefaultIXor();

    private DefaultIXor() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IXOR;
    }
}
