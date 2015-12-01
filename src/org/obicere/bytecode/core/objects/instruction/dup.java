package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup extends Instruction {

    private static final String MNEMONIC = "dup";
    private static final int    OPCODE   = 0x59;

    public dup() {
        super(MNEMONIC, OPCODE);
    }
}
