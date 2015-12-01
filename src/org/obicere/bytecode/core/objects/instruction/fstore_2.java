package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fstore_2 extends Instruction {

    private static final String MNEMONIC = "fstore_2";
    private static final int    OPCODE   = 0x45;

    public fstore_2() {
        super(MNEMONIC, OPCODE);
    }
}
