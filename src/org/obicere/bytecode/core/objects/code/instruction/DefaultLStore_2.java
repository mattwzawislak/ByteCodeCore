package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LStore_2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLStore_2 extends AbstractInstruction implements LStore_2 {

    public static final String MNEMONIC = "lstore_2";

    public static final DefaultLStore_2 INSTANCE = new DefaultLStore_2();

    private DefaultLStore_2() {
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
        return InstructionReader.OPCODE_LSTORE_2;
    }
}
