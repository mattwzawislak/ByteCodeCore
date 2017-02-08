package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DStore_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDStore_1 extends AbstractInstruction implements DStore_1 {

    public static final String MNEMONIC = "dstore_1";

    public static final DStore_1 INSTANCE = new DefaultDStore_1();

    private DefaultDStore_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DSTORE_1;
    }

    @Override
    public int getIndex() {
        return 1;
    }
}
