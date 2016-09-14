package org.obicere.bytecode.core.objects.code.block;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.code.instruction.Instruction;

/**
 */
public abstract class CodeBlock implements Identifiable {

    protected Instruction[] instructions;

    public abstract int getStartPC();

    public abstract String getName();

    public Instruction[] getInstructions() {
        return instructions;
    }

    public void setInstructions(final Instruction[] instructions) {
        this.instructions = instructions;
    }
}
