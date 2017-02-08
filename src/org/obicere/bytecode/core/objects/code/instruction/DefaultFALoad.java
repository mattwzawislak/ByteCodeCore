package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFALoad extends AbstractInstruction implements FALoad {

    public static final String MNEMONIC = "faload";

    public static final FALoad INSTANCE = new DefaultFALoad();

    private DefaultFALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FALOAD;
    }
}
