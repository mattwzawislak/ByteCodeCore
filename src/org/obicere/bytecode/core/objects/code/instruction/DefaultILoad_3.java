package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ILoad_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultILoad_3 extends AbstractInstruction implements ILoad_3 {

    public static final String MNEMONIC = "iload_3";

    public static final ILoad_3 INSTANCE = new DefaultILoad_3();

    private DefaultILoad_3() {
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
        return InstructionReader.OPCODE_ILOAD_3;
    }
}
