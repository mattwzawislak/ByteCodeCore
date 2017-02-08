package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.If_ICmpLt;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIf_ICmpLt extends AbstractInstruction implements If_ICmpLt {

    public static final String MNEMONIC = "if_icmplt";

    private final Label label;

    public DefaultIf_ICmpLt(final Label label) {
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
        return InstructionReader.OPCODE_IF_ICMPLT;
    }
}
