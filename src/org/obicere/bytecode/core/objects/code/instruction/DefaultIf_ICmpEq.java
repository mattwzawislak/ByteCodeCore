package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.If_ICmpEq;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultIf_ICmpEq extends AbstractInstruction implements If_ICmpEq {

    public static final String MNEMONIC = "if_icmpeq";

    private final Label label;

    public DefaultIf_ICmpEq(final Label label){
        this.label = label;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Label getBranch(){
        return label;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_IF_ICMPEQ;
    }
}
