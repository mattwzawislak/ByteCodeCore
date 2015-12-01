package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2s extends Instruction {

    private static final String MNEMONIC = "i2s";
    private static final int    OPCODE   = 0x93;

    public i2s() {
        super(MNEMONIC, OPCODE);
    }
}
