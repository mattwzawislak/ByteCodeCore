package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.NewArray;
import org.javacore.type.Type;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultNewArray extends AbstractInstruction implements NewArray {

    public static final String MNEMONIC = "newarray";

    private final Type type;

    public DefaultNewArray(final Type type) {
        this.type = type;
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
        return InstructionReader.OPCODE_NEWARRAY;
    }
}
