package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lcmp extends Instruction {

    private static final String MNEMONIC = "lcmp";
    private static final int    OPCODE   = 0x94;

    public lcmp() {
        super(MNEMONIC, OPCODE);
    }
}
