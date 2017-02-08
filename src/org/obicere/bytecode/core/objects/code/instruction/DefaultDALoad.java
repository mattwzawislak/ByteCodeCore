package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDALoad extends AbstractInstruction implements DALoad {

    public static final String MNEMONIC = "daload";

    public static final DALoad INSTANCE = new DefaultDALoad();

    private DefaultDALoad() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DALOAD;
    }
}
