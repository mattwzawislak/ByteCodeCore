package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ALoad_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultALoad_0 extends AbstractInstruction implements ALoad_0 {

    public static final String MNEMONIC = "aload_0";

    public static final ALoad_0 INSTANCE = new DefaultALoad_0();

    private DefaultALoad_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ALOAD_0;
    }

    @Override
    public int getIndex() {
        return 0;
    }
}
