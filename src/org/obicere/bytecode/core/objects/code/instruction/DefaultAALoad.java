package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultAALoad extends AbstractInstruction implements AALoad {

    public static final String MNEMONIC = "aaload";

    public static final AALoad INSTANCE = new DefaultAALoad();

    private DefaultAALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_AALOAD;
    }
}
