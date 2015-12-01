package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class i2b extends Instruction {

    private static final String MNEMONIC = "i2b";
    private static final int    OPCODE   = 0x91;

    public i2b() {
        super(MNEMONIC, OPCODE);
    }
}
