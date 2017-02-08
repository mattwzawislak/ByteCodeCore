package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup2;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDup2 extends AbstractInstruction implements Dup2 {

    public static final String MNEMONIC = "dup2";

    public static final Dup2 INSTANCE = new DefaultDup2();

    private DefaultDup2() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DUP2;
    }
}
