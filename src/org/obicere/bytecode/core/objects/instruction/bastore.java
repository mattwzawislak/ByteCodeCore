package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class bastore extends Instruction {

    private static final String MNEMONIC = "bastore";
    private static final int    OPCODE   = 0x54;

    public bastore() {
        super(MNEMONIC, OPCODE);
    }
}
