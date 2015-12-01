package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2l extends Instruction {

    private static final String MNEMONIC = "i2l";
    private static final int    OPCODE   = 0x85;

    public i2l() {
        super(MNEMONIC, OPCODE);
    }
}
