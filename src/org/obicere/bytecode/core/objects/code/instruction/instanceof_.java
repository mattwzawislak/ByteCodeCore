package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;
import org.obicere.bytecode.core.type.Type;

/**
 * @author Obicere
 */
public class instanceof_ extends Instruction {

    public static final String IDENTIFIER = "instanceof";

    private final Type type;

    public instanceof_(final Type type) {
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
        return InstructionReader.OPCODE_INSTANCEOF;
    }
}
