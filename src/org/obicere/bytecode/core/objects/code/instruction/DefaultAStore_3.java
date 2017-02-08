package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.AStore_3;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultAStore_3 extends AbstractInstruction implements AStore_3 {

    public static final String MNEMONIC = "astore_3";

    public static final AStore_3 INSTANCE = new DefaultAStore_3();

    private DefaultAStore_3() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ASTORE_3;
    }

    @Override
    public int getIndex() {
        return 3;
    }
}
