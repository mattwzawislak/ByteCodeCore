package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AStore_0;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultAStore_0 extends AbstractInstruction implements AStore_0 {

    public static final String MNEMONIC = "astore_0";

    public static final AStore_0 INSTANCE = new DefaultAStore_0();

    private DefaultAStore_0() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ASTORE_0;
    }

    @Override
    public int getIndex() {
        return 0;
    }
}
