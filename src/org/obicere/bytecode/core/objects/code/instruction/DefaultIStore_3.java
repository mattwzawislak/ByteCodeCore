package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IStore_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIStore_3 extends AbstractInstruction implements IStore_3 {

    public static final String MNEMONIC = "istore_3";

    public static final IStore_3 INSTANCE = new DefaultIStore_3();

    private DefaultIStore_3() {
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
        return InstructionReader.OPCODE_ISTORE_3;
    }
}
