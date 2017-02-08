package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFLoad_3 extends AbstractInstruction implements FLoad_3 {

    public static final String MNEMONIC = "fload_3";

    public static final FLoad_3 INSTANCE = new DefaultFLoad_3();

    private DefaultFLoad_3() {
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
        return InstructionReader.OPCODE_FLOAD_3;
    }
}
