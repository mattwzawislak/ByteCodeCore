package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LSub;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLSub extends AbstractInstruction implements LSub {

    public static final String MNEMONIC = "lsub";

    public static final LSub INSTANCE = new DefaultLSub();

    private DefaultLSub() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LSUB;
    }
}
