package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LLoad_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLLoad_3 extends AbstractInstruction implements LLoad_3 {

    public static final String MNEMONIC = "lload_3";

    public static final LLoad_3 INSTANCE = new DefaultLLoad_3();

    private DefaultLLoad_3() {
    }

    @Override
    public int getIndex() {
        return 3;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LLOAD_3;
    }
}
