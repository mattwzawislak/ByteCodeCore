package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFLoad extends AbstractInstruction implements FLoad {

    public static final String MNEMONIC = "fload";

    private final int index;

    public DefaultFLoad(final int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FLOAD;
    }
}
