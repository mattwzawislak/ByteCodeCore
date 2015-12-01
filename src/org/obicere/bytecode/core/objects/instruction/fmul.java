package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fmul extends Instruction {

    private static final String MNEMONIC = "fmul";
    private static final int    OPCODE   = 0x6a;

    public fmul() {
        super(MNEMONIC, OPCODE);
    }
}
