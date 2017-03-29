package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.NewArray;
import org.javacore.type.Type;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultNewArray extends AbstractInstruction implements NewArray {

    public static final String MNEMONIC = "newarray";

    private final Type type;

    public DefaultNewArray(final Type type) {
        this.type = type;
    }

    @Override
    public int getLength(final int pc) {
        return 2;
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
        return Instructions.OPCODE_NEWARRAY;
    }
}
