package org.obicere.bytecode.core.objects.code.block;

import org.javacore.code.Code;
import org.javacore.code.block.CodeBlock;
import org.javacore.code.instruction.Instruction;

/**
 */
public abstract class AbstractCodeBlock implements CodeBlock {

    protected Code code;

    protected Instruction[] instructions;

    private int sizeInBytes;

    public AbstractCodeBlock(final Code code) {
        this.code = code;
    }

    @Override
    public Instruction[] getInstructions() {
        return instructions;
    }

    @Override
    public int getSize() {
        return sizeInBytes;
    }

    @Override
    public Code getDeclaringCode() {
        return code;
    }
}
