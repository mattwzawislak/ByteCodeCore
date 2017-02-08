package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LLoad_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLLoad_1 extends AbstractInstruction implements LLoad_1 {

    public static final String MNEMONIC = "lload_1";

    public static final LLoad_1 INSTANCE = new DefaultLLoad_1();

    private DefaultLLoad_1() {
    }

    @Override
    public int getIndex() {
        return 1;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LLOAD_1;
    }
}
