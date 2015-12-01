package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lconst_0 extends Instruction {

    private static final String MNEMONIC = "lconst_0";
    private static final int    OPCODE   = 0x09;

    public lconst_0() {
        super(MNEMONIC, OPCODE);
    }
}
