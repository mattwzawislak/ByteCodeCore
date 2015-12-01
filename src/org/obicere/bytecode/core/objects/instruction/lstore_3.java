package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lstore_3 extends Instruction {

    private static final String MNEMONIC = "lstore_3";
    private static final int    OPCODE   = 0x42;

    public lstore_3() {
        super(MNEMONIC, OPCODE);
    }
}
