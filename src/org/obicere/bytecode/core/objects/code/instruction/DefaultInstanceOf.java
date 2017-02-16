package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.InstanceOf;
import org.javacore.type.Type;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultInstanceOf extends AbstractInstruction implements InstanceOf {

    public static final String MNEMONIC = "instanceof";

    private final Type type;

    public DefaultInstanceOf(final Type type) {
        this.type = type;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_INSTANCEOF;
    }
}
