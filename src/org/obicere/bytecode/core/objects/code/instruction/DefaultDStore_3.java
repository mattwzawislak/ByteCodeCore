package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DStore_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDStore_3 extends AbstractInstruction implements DStore_3 {

    public static final String MNEMONIC = "dstore_3";

    public static final DStore_3 INSTANCE = new DefaultDStore_3();

    private DefaultDStore_3() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DSTORE_3;
    }

    @Override
    public int getIndex() {
        return 3;
    }
}
