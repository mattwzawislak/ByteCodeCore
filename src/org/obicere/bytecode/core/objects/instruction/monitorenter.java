package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class monitorenter extends Instruction {

    private static final String MNEMONIC = "monitorenter";
    private static final int    OPCODE   = 0xc2;

    public monitorenter() {
        super(MNEMONIC, OPCODE);
    }
}
