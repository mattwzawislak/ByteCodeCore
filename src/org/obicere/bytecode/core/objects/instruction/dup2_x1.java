package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup2_x1 extends Instruction {

    private static final String MNEMONIC = "dup2_x1";
    private static final int    OPCODE   = 0x5d;

    public dup2_x1() {
        super(MNEMONIC, OPCODE);
    }
}
