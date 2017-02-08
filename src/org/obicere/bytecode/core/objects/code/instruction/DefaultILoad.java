package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ILoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultILoad extends AbstractInstruction implements ILoad {

    public static final String MNEMONIC = "iload";

    private final int index;

    public DefaultILoad(final int index) {
        this.index = index;
    }

    @Override
    public int getIndex(){
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ILOAD;
    }
}
