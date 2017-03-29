package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FALoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultFALoad extends AbstractInstruction implements FALoad {

    public static final String MNEMONIC = "faload";

    public static final FALoad INSTANCE = new DefaultFALoad();

    private DefaultFALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_FALOAD;
    }
}
