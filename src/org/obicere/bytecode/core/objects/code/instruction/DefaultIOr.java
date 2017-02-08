package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IOr;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIOr extends AbstractInstruction implements IOr {

    public static final String MNEMONIC = "ior";

    public static final IOr INSTANCE = new DefaultIOr();

    private DefaultIOr() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IOR;
    }
}
