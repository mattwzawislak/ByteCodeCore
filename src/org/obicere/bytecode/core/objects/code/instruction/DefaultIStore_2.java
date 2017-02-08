package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IStore_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIStore_2 extends AbstractInstruction implements IStore_2 {

    public static final String MNEMONIC = "istore_2";

    public static final IStore_2 INSTANCE = new DefaultIStore_2();

    private DefaultIStore_2() {
    }

    @Override
    public int getIndex() {
        return 2;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ISTORE_2;
    }
}
