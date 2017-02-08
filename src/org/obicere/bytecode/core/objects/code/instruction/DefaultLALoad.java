package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLALoad extends AbstractInstruction implements LALoad {

    public static final String MNEMONIC = "laload";

    public static final LALoad INSTANCE = new DefaultLALoad();

    private DefaultLALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LALOAD;
    }
}
