package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FSub;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFSub extends AbstractInstruction implements FSub {

    public static final String MNEMONIC = "fsub";

    public static final FSub INSTANCE = new DefaultFSub();

    private DefaultFSub() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FSUB;
    }
}
