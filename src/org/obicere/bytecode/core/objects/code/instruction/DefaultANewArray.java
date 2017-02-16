package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ANewArray;
import org.javacore.type.Type;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultANewArray extends AbstractInstruction implements ANewArray {

    public static final String MNEMONIC = "anewarray";

    private final Type type;

    public DefaultANewArray(final Type type) {
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
        return InstructionReader.OPCODE_ANEWARRAY;
    }
}
