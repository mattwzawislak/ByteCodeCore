package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.IfNe;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIfNe extends AbstractInstruction implements IfNe {

    public static final String MNEMONIC = "ifne";

    private final Label label;

    public DefaultIfNe(final Label label){
        this.label = label;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Label getBranch() {
        return label;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IFNE;
    }
}
