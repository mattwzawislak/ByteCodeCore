package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class drem extends Instruction {

    private static final String MNEMONIC = "drem";
    private static final int    OPCODE   = 0x73;

    public drem() {
        super(MNEMONIC, OPCODE);
    }

}
