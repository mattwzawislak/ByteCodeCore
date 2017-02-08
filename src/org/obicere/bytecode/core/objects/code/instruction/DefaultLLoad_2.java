package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LLoad_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLLoad_2 extends AbstractInstruction implements LLoad_2 {

    public static final String MNEMONIC = "lload_2";

    public static final LLoad_2 INSTANCE = new DefaultLLoad_2();

    private DefaultLLoad_2() {
    }

    @Override
    public int getIndex() {
        return 2;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LLOAD_2;
    }
}
