package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.CALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultCALoad extends AbstractInstruction implements CALoad {

    public static final String MNEMONIC = "caload";

    public static final CALoad INSTANCE = new DefaultCALoad();

    private DefaultCALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_CALOAD;
    }
}
