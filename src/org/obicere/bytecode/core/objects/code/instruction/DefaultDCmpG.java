package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DCmpG;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDCmpG extends AbstractInstruction implements DCmpG {

    public static final String MNEMONIC = "dcmpg";

    public static final DCmpG INSTANCE = new DefaultDCmpG();

    private DefaultDCmpG() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DCMPG;
    }
}
