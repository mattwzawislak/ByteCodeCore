package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.Goto_w;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultGoto_w extends AbstractInstruction implements Goto_w {

    public static final String MNEMONIC = "goto_w";

    private final Label label;

    public DefaultGoto_w(final Label label) {
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
        return InstructionReader.OPCODE_GOTO_W;
    }
}
