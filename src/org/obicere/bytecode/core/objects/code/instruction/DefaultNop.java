package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Nop;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultNop extends AbstractInstruction implements Nop {

    public static final String MNEMONIC = "nop";

    public static final Nop INSTANCE = new DefaultNop();

    private DefaultNop() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_NOP;
    }
}
