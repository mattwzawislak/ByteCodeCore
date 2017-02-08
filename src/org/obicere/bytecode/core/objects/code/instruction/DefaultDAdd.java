package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DAdd;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDAdd extends AbstractInstruction implements DAdd {

    public static final String MNEMONIC = "dadd";

    public static final DAdd INSTANCE = new DefaultDAdd();

    private DefaultDAdd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DADD;
    }
}
