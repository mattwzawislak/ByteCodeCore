package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ishr extends Instruction {

    private static final String MNEMONIC = "ishr";
    private static final int    OPCODE   = 0x7a;

    public ishr() {
        super(MNEMONIC, OPCODE);
    }
}
