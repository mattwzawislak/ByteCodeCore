package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.BALoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultBALoad extends AbstractInstruction implements BALoad {

    public static final String MNEMONIC = "baload";

    public static final BALoad INSTANCE = new DefaultBALoad();

    private DefaultBALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_BALOAD;
    }
}
