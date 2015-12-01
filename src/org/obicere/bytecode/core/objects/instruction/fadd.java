package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fadd extends Instruction {

    private static final String MNEMONIC = "fadd";
    private static final int    OPCODE   = 0x62;

    public fadd() {
        super(MNEMONIC, OPCODE);
    }
}
