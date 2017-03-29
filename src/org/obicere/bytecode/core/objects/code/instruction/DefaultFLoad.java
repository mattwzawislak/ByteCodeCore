package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad;
import org.javacore.code.instruction.Instructions;

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
    public int getLength(final int pc) {
        return 2;
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
        return Instructions.OPCODE_FLOAD;
    }
}
