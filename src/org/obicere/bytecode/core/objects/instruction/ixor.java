package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ixor extends Instruction {

    private static final String MNEMONIC = "ixor";
    private static final int    OPCODE   = 0x82;

    public ixor() {
        super(MNEMONIC, OPCODE);
    }
}
