package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class imul extends Instruction {

    private static final String MNEMONIC = "imul";
    private static final int    OPCODE   = 0x74;

    public imul() {
        super(MNEMONIC, OPCODE);
    }
}
