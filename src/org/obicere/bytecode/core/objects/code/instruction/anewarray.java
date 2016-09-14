package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class anewarray extends Instruction {

    public static final String IDENTIFIER = "anewarray";

    private final Type type;

    public anewarray(final Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ANEWARRAY;
    }
}
