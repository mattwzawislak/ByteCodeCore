package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IShL;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIShL extends AbstractInstruction implements IShL {

    public static final String MNEMONIC = "ishl";

    public static final IShL INSTANCE = new DefaultIShL();

    private DefaultIShL() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ISHL;
    }
}
