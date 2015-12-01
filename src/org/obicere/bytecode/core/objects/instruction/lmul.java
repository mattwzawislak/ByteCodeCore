package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lmul extends Instruction {

    private static final String MNEMONIC = "lmul";
    private static final int    OPCODE   = 0x69;

    public lmul() {
        super(MNEMONIC, OPCODE);
    }
}
