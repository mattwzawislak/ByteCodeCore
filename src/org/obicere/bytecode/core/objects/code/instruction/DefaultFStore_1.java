package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FStore_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFStore_1 extends AbstractInstruction implements FStore_1 {

    public static final String MNEMONIC = "fstore_1";

    public static final FStore_1 INSTANCE = new DefaultFStore_1();

    private DefaultFStore_1() {
    }

    @Override
    public int getIndex() {
        return 1;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FSTORE_1;
    }
}
