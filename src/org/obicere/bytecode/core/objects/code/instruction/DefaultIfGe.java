package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.IfGe;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIfGe extends AbstractInstruction implements IfGe {

    public static final String MNEMONIC = "ifge";

    private final Label label;

    public DefaultIfGe(final Label label) {
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
        return InstructionReader.OPCODE_IFGE;
    }
}
