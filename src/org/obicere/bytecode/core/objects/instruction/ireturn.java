package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ireturn extends Instruction {

    private static final String MNEMONIC = "ireturn";
    private static final int    OPCODE   = 0xac;

    public ireturn() {
        super(MNEMONIC, OPCODE);
    }
}
