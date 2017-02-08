package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FCmpG;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFCmpG extends AbstractInstruction implements FCmpG {

    public static final String MNEMONIC = "fcmpg";

    public static final FCmpG INSTANCE = new DefaultFCmpG();

    private DefaultFCmpG() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FCMPG;
    }
}
