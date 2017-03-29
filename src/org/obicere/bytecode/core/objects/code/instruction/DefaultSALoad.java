package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.SALoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultSALoad extends AbstractInstruction implements SALoad {

    public static final String MNEMONIC = "saload";

    public static final DefaultSALoad INSTANCE = new DefaultSALoad();

    private DefaultSALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_SALOAD;
    }
}
