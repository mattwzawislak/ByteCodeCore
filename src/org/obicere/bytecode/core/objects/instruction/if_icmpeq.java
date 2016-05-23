package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.label.Label;
import org.obicere.bytecode.core.reader.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class if_icmpeq extends Instruction {

    public static final String IDENTIFIER = "if_icmpeq";

    private final Label label;

    public if_icmpeq(final Label label){
        this.label = label;
    }

    public Label getLabel(){
        return label;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_IF_ICMPEQ;
    }
}
