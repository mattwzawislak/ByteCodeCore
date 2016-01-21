package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.ByteCodeElement;

/**
 * @author Obicere
 */
public abstract class Instruction extends ByteCodeElement {

    private final String mnemonic;

    private final int opcode;

    public Instruction(final String mnemonic, final int opcode) {
        if (mnemonic == null) {
            throw new NullPointerException("mnemonic must be non-null");
        }
        this.mnemonic = mnemonic;
        this.opcode = opcode;
    }

    public final String getMnemonic() {
        return mnemonic;
    }

    public final int getOpcode() {
        return opcode;
    }

}
