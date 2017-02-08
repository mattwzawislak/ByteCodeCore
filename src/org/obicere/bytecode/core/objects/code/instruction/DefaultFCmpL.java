package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FCmpL;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFCmpL extends AbstractInstruction implements FCmpL {

    public static final String MNEMONIC = "fcmpl";

    public static final FCmpL INSTANCE = new DefaultFCmpL();

    private DefaultFCmpL() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FCMPL;
    }
}
