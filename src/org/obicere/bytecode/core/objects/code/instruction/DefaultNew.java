package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCClass;
import org.javacore.code.instruction.New;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultNew extends AbstractInstruction implements New {

    public static final String MNEMONIC = "new";

    private final JCClass type;

    public DefaultNew(final JCClass type) {
        this.type = type;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public JCClass getType() {
        return type;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_NEW;
    }

}
