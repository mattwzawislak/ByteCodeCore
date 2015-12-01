package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iconst_1 extends Instruction {

    private static final String MNEMONIC = "iconst_1";
    private static final int    OPCODE   = 0x04;

    public iconst_1() {
        super(MNEMONIC, OPCODE);
    }
}
