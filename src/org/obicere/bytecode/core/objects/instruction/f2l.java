package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class f2l extends Instruction {

    private static final String MNEMONIC = "f2l";
    private static final int    OPCODE   = 0x8c;

    public f2l() {
        super(MNEMONIC, OPCODE);
    }
}
