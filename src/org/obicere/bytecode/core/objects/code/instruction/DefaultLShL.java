package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LShL;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLShL extends AbstractInstruction implements LShL {

    public static final String MNEMONIC = "lshl";

    public static final LShL INSTANCE = new DefaultLShL();

    private DefaultLShL() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LSHL;
    }
}
