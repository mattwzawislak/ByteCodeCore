package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DLoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDLoad extends AbstractInstruction implements DLoad {

    public static final String MNEMONIC = "dload";

    private final int index;

    public DefaultDLoad(final int index) {
        this.index = index;
    }

    @Override
    public int getLength(final int pc) {
        return 2;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DLOAD;
    }
}
