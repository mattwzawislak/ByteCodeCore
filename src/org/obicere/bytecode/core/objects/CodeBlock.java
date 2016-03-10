package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.instruction.Instruction;

/**
 */
public abstract class CodeBlock extends ByteCodeElement {

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
