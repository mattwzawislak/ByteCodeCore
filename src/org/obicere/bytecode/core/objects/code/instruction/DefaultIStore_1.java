package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IStore_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIStore_1 extends AbstractInstruction implements IStore_1 {

    public static final String MNEMONIC = "istore_1";

    public static final IStore_1 INSTANCE = new DefaultIStore_1();

    private DefaultIStore_1() {
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
        return InstructionReader.OPCODE_ISTORE_1;
    }
}
