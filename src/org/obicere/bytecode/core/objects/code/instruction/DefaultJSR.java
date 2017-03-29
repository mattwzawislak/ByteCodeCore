package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.JSR;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultJSR extends AbstractInstruction implements JSR {

    public static final String MNEMONIC = "jsr";

    private final Label label;

    public DefaultJSR(final Label label){
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
        return Instructions.OPCODE_JSR;
    }
}
