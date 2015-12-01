package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class frem extends Instruction {

    private static final String MNEMONIC = "frem";
    private static final int    OPCODE   = 0x72;

    public frem() {
        super(MNEMONIC, OPCODE);
    }
}
