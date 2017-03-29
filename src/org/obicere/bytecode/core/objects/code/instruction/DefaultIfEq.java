package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.IfEq;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIfEq extends AbstractInstruction implements IfEq {

    public static final String MNEMONIC = "ifeq";

    private final Label label;

    public DefaultIfEq(final Label label) {
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
        return Instructions.OPCODE_IFEQ;
    }
}
