package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class goto_w extends Instruction {

    public static final String IDENTIFIER = "goto_w";

    private final Label label;

    public goto_w(final Label label) {
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
        return InstructionReader.OPCODE_GOTO_W;
    }
}
