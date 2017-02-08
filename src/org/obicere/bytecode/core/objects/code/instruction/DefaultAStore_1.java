package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AStore_1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultAStore_1 extends AbstractInstruction implements AStore_1 {

    public static final String MNEMONIC = "astore_1";

    public static final AStore_1 INSTANCE = new DefaultAStore_1();

    private DefaultAStore_1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ASTORE_1;
    }

    @Override
    public int getIndex() {
        return 1;
    }
}
