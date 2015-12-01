package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class fsub extends Instruction {

    private static final String MNEMONIC = "fsub";
    private static final int    OPCODE   = 0x66;

    public fsub() {
        super(MNEMONIC, OPCODE);
    }
}
