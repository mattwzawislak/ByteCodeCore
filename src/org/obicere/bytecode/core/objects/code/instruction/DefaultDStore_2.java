package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DStore_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDStore_2 extends AbstractInstruction implements DStore_2 {

    public static final String MNEMONIC = "dstore_2";

    public static final DStore_2 INSTANCE = new DefaultDStore_2();

    private DefaultDStore_2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DSTORE_2;
    }

    @Override
    public int getIndex() {
        return 2;
    }
}
