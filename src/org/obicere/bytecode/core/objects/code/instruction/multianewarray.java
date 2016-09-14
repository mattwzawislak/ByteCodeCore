package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class multianewarray extends Instruction {

    public static final String IDENTIFIER = "multianewarray";

    private final Type type;

    private final int dimensions;

    public multianewarray(final Type type, final int dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public Type getType() {
        return type;
    }

    public int getDimensions() {
        return dimensions;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_MULTIANEWARRAY;
    }
}
