package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DLoad_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDLoad_1 extends AbstractInstruction implements DLoad_1 {

    public static final String MNEMONIC = "dload_1";

    public static final DLoad_1 INSTANCE = new DefaultDLoad_1();

    private DefaultDLoad_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DLOAD_1;
    }

    @Override
    public int getIndex() {
        return 1;
    }
}
