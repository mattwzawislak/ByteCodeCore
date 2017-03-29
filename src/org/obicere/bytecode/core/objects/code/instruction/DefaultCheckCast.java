package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.CheckCast;
import org.javacore.type.Type;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultCheckCast extends AbstractInstruction implements CheckCast {

    public static final String MNEMONIC = "checkcast";

    private final Type type;

    public DefaultCheckCast(final Type type) {
        this.type = type;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_CHECKCAST;
    }
}
