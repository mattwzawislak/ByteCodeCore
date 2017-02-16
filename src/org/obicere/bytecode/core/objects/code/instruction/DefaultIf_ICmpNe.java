package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.If_ICmpNe;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIf_ICmpNe extends AbstractInstruction implements If_ICmpNe {

    public static final String MNEMONIC = "if_icmpne";

    private final Label label;

    public DefaultIf_ICmpNe(final Label label) {
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
        return InstructionReader.OPCODE_IF_ICMPNE;
    }
}
