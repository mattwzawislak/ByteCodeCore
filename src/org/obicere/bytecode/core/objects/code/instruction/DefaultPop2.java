package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Pop2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultPop2 extends AbstractInstruction implements Pop2 {

    public static final String MNEMONIC = "pop2";

    public static final Pop2 INSTANCE = new DefaultPop2();

    private DefaultPop2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_POP2;
    }
}
