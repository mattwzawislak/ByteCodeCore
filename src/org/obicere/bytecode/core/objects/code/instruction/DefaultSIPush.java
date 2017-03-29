package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.SIPush;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultSIPush extends AbstractInstruction implements SIPush {

    public static final String MNEMONIC = "sipush";

    private final int value;

    public DefaultSIPush(final int value) {
        this.value = value;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public int getShort() {
        return value;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_SIPUSH;
    }
}
