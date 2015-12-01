package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dastore extends Instruction {

    private static final String MNEMONIC = "dastore";
    private static final int    OPCODE   = 0x52;

    public dastore() {
        super(MNEMONIC, OPCODE);
    }
}
