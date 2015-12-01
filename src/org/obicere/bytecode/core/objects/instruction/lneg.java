package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lneg extends Instruction {

    private static final String MNEMONIC = "lneg";
    private static final int    OPCODE   = 0x75;

    public lneg() {
        super(MNEMONIC, OPCODE);
    }
}
