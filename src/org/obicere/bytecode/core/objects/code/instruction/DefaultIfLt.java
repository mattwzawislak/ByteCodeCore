package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.IfLt;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIfLt extends AbstractInstruction implements IfLt {

    public static final String MNEMONIC = "iflt";

    private final Label label;

    public DefaultIfLt(final Label label) {
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
        return Instructions.OPCODE_IFLT;
    }
}
