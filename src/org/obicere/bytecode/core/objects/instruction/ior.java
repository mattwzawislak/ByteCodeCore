package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ior extends Instruction {

    private static final String MNEMONIC = "ior";
    private static final int    OPCODE   = 0x80;

    public ior() {
        super(MNEMONIC, OPCODE);
    }
}
