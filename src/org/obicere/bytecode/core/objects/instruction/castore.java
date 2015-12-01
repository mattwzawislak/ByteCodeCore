package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class castore extends Instruction {

    private static final String MNEMONIC = "castore";
    private static final int    OPCODE   = 0x55;

    public castore() {
        super(MNEMONIC, OPCODE);
    }
}
