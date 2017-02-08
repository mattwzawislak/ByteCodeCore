package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LCmp;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLCmp extends AbstractInstruction implements LCmp {

    public static final String MNEMONIC = "lcmp";

    public static final LCmp INSTANCE = new DefaultLCmp();

    private DefaultLCmp() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LCMP;
    }
}
