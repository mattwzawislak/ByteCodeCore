package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ALoad_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultALoad_1 extends AbstractInstruction implements ALoad_1 {

    public static final String MNEMONIC = "aload_1";

    public static final ALoad_1 INSTANCE = new DefaultALoad_1();

    private DefaultALoad_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ALOAD_1;
    }

    @Override
    public int getIndex() {
        return 1;
    }
}
