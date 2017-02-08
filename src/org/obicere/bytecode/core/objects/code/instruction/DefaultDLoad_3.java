package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DLoad_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDLoad_3 extends AbstractInstruction implements DLoad_3 {

    public static final String MNEMONIC = "dload_3";

    public static final DLoad_3 INSTANCE = new DefaultDLoad_3();

    private DefaultDLoad_3() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DLOAD_3;
    }

    @Override
    public int getIndex() {
        return 3;
    }
}
