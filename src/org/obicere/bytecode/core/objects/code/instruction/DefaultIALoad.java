package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IALoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIALoad extends AbstractInstruction implements IALoad {

    public static final String MNEMONIC = "iaload";

    public static final IALoad INSTANCE = new DefaultIALoad();

    private DefaultIALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IALOAD;
    }
}
