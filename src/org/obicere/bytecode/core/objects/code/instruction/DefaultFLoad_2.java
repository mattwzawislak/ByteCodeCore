package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FLoad_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFLoad_2 extends AbstractInstruction implements FLoad_2 {

    public static final String MNEMONIC = "fload_2";

    public static final FLoad_2 INSTANCE = new DefaultFLoad_2();

    private DefaultFLoad_2() {
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
        return InstructionReader.OPCODE_FLOAD_2;
    }
}
