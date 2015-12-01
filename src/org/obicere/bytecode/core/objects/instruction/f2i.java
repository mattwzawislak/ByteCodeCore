package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class f2i extends Instruction {

    private static final String MNEMONIC = "f2i";
    private static final int    OPCODE   = 0x8b;

    public f2i() {
        super(MNEMONIC, OPCODE);
    }
}
