package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.MultiANewArray;
import org.javacore.type.Type;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultMultiANewArray extends AbstractInstruction implements MultiANewArray {

    public static final String MNEMONIC = "multianewarray";

    private final Type type;

    private final int dimensions;

    public DefaultMultiANewArray(final Type type, final int dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    @Override
    public int getLength(final int pc) {
        return 4;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getDimensions() {
        return dimensions;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_MULTIANEWARRAY;
    }
}
