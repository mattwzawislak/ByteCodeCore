package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIALoad extends AbstractInstruction implements IALoad {

    public static final String MNEMONIC = "iaload";

    public static final IALoad INSTANCE = new DefaultIALoad();

    private DefaultIALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IALOAD;
    }
}
