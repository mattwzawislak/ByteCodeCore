package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IStore_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIStore_0 extends AbstractInstruction implements IStore_0 {

    public static final String MNEMONIC = "istore_0";

    public static final IStore_0 INSTANCE = new DefaultIStore_0();

    private DefaultIStore_0() {
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ISTORE_0;
    }
}
