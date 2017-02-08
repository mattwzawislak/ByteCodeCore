package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DSub;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDSub extends AbstractInstruction implements DSub {

    public static final String MNEMONIC = "dsub";

    public static final DSub INSTANCE = new DefaultDSub();

    private DefaultDSub() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DSUB;
    }
}
