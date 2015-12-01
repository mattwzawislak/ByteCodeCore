package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class land extends Instruction {

    private static final String MNEMONIC = "land";
    private static final int    OPCODE   = 0x7f;

    public land() {
        super(MNEMONIC, OPCODE);
    }
}
