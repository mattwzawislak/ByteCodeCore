package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lsub extends Instruction {

    private static final String MNEMONIC = "lsub";
    private static final int    OPCODE   = 0x65;

    public lsub() {
        super(MNEMONIC, OPCODE);
    }
}
