package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lload_3 extends Instruction {

    private static final String MNEMONIC = "lload_3";
    private static final int    OPCODE   = 0x21;

    public lload_3() {
        super(MNEMONIC, OPCODE);
    }
}
