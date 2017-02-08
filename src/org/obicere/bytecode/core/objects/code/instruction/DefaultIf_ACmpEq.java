package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.If_ACmpEq;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIf_ACmpEq extends AbstractInstruction implements If_ACmpEq {

    public static final String MNEMONIC = "if_acmpeq";

    private final Label label;

    public DefaultIf_ACmpEq(final Label label) {
        this.label = label;
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
        return InstructionReader.OPCODE_IF_ACMPEQ;
    }
}
