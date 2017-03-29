package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ILoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultILoad extends AbstractInstruction implements ILoad {

    public static final String MNEMONIC = "iload";

    private final int index;

    public DefaultILoad(final int index) {
        this.index = index;
    }

    @Override
    public int getLength(final int pc) {
        return 2;
    }

    @Override
    public int getIndex(){
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_ILOAD;
    }
}
