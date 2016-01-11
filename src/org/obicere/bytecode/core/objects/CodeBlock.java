package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.instruction.Instruction;

import java.util.LinkedList;
import java.util.List;

/**
 */
public abstract class CodeBlock extends ByteCodeElement {

    private final List<Instruction> instructions = new LinkedList<>();

    public abstract int getStartPC();

    public abstract String getName();

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
