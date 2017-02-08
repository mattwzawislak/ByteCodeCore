package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.BALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultBALoad extends AbstractInstruction implements BALoad {

    public static final String MNEMONIC = "baload";

    public static final BALoad INSTANCE = new DefaultBALoad();

    private DefaultBALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_BALOAD;
    }
}
