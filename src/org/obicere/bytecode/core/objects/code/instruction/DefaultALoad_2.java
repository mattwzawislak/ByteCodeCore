package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ALoad_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultALoad_2 extends AbstractInstruction implements ALoad_2 {

    public static final String MNEMONIC = "aload_2";

    public static final ALoad_2 INSTANCE = new DefaultALoad_2();

    private DefaultALoad_2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ALOAD_2;
    }

    @Override
    public int getIndex() {
        return 2;
    }
}
