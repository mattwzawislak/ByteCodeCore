package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dstore_0 extends Instruction {

    private static final String MNEMONIC = "dstore_0";
    private static final int    OPCODE   = 0x47;

    public dstore_0() {
        super(MNEMONIC, OPCODE);
    }
}
