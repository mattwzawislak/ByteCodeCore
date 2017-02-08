package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FStore_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFStore_3 extends AbstractInstruction implements FStore_3 {

    public static final String MNEMONIC = "fstore_3";

    public static final FStore_3 INSTANCE = new DefaultFStore_3();

    private DefaultFStore_3() {
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
        return InstructionReader.OPCODE_FSTORE_3;
    }
}
