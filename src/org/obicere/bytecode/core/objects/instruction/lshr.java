package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lshr extends Instruction {

    private static final String MNEMONIC = "lshr";
    private static final int    OPCODE   = 0x7b;

    public lshr() {
        super(MNEMONIC, OPCODE);
    }
}
