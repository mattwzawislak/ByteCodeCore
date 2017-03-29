package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.Goto;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultGoto extends AbstractInstruction implements Goto {

    public static final String MNEMONIC = "goto";

    private final Label label;

    public DefaultGoto(final Label label) {
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
        return Instructions.OPCODE_GOTO;
    }
}
