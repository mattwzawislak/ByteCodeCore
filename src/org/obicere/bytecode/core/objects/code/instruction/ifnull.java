package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class ifnull extends Instruction {

    public static final String IDENTIFIER = "ifnull";

    private final Label label;

    public ifnull(final Label label){
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
        return InstructionReader.OPCODE_IFNULL;
    }
}
