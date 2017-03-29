package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LLoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLLoad extends AbstractInstruction implements LLoad {

    public static final String MNEMONIC = "lload";

    private final int index;

    public DefaultLLoad(final int index) {
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
        return Instructions.OPCODE_LLOAD;
    }
}
