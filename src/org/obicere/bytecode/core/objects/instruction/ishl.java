package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ishl extends Instruction {

    private static final String MNEMONIC = "ishl";
    private static final int    OPCODE   = 0x78;

    public ishl() {
        super(MNEMONIC, OPCODE);
    }
}
