package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fload_3 extends Instruction {

    private static final String MNEMONIC = "fload_3";
    private static final int    OPCODE   = 0x25;

    public fload_3() {
        super(MNEMONIC, OPCODE);
    }
}
