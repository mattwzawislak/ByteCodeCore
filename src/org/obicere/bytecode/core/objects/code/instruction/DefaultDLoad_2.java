package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DLoad_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDLoad_2 extends AbstractInstruction implements DLoad_2 {

    public static final String MNEMONIC = "dload_2";

    public static final DLoad_2 INSTANCE = new DefaultDLoad_2();

    private DefaultDLoad_2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DLOAD_2;
    }

    @Override
    public int getIndex() {
        return 2;
    }
}
