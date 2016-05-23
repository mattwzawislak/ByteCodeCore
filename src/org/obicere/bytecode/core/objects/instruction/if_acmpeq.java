package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class if_acmpeq extends Instruction {

    public static final String IDENTIFIER = "if_acmpeq";

    private final Label label;

    public if_acmpeq(final Label label) {
        this.label = label;
    }

    public Label getLabel() {
        return label;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_IF_ACMPEQ;
    }
}
