package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IUShR;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIUShR extends AbstractInstruction implements IUShR {

    public static final String MNEMONIC = "iushr";

    public static final IUShR INSTANCE = new DefaultIUShR();

    private DefaultIUShR() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IUSHR;
    }
}
