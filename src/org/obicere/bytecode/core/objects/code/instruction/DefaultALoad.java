package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ALoad;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultALoad extends AbstractInstruction implements ALoad  {

    public static final  String MNEMONIC = "aload";

    private final int index;

    public DefaultALoad(final int index) {
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
        return Instructions.OPCODE_ALOAD;
    }
}
