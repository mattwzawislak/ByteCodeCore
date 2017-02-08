package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DStore_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDStore_0 extends AbstractInstruction implements DStore_0 {

    public static final String MNEMONIC = "dstore_0";

    public static final DStore_0 INSTANCE = new DefaultDStore_0();

    private DefaultDStore_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DSTORE_0;
    }

    @Override
    public int getIndex() {
        return 0;
    }
}
