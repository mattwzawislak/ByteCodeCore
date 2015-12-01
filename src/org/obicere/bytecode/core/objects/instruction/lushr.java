package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lushr extends Instruction {

    private static final String MNEMONIC = "lushr";
    private static final int    OPCODE   = 0x7d;

    public lushr() {
        super(MNEMONIC, OPCODE);
    }
}
