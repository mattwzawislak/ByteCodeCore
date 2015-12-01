package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.Modeler;

/**
 * @author Obicere
 */
public class aastore extends Instruction implements Modeler {

    private static final String MNEMONIC = "aastore";
    private static final int    OPCODE   = 0x53;

    public aastore() {
        super(MNEMONIC, OPCODE);
    }
}
