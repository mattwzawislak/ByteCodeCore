package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fconst_0 extends Instruction {

    private static final String MNEMONIC = "fconst_0";
    private static final int    OPCODE   = 0x0b;

    public fconst_0() {
        super(MNEMONIC, OPCODE);
    }
}
