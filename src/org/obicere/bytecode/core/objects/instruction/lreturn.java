package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lreturn extends Instruction {

    private static final String MNEMONIC = "lreturn";
    private static final int    OPCODE   = 0xad;

    public lreturn() {
        super(MNEMONIC, OPCODE);
    }
}
