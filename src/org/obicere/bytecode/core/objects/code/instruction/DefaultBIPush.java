package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.BIPush;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultBIPush extends AbstractInstruction implements BIPush {

    public static final String MNEMONIC = "bipush";

    private final byte value;

    public DefaultBIPush(final byte value) {
        this.value = value;
    }

    @Override
    public int getLength(final int pc) {
        return 2;
    }

    @Override
    public int getByte() {
        return value;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_BIPUSH;
    }
}
