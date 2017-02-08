package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IShR;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIShR extends AbstractInstruction implements IShR {

    public static final String MNEMONIC = "ishr";

    public static final IShR INSTANCE = new DefaultIShR();

    private DefaultIShR() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ISHR;
    }
}
