package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IAdd;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIAdd extends AbstractInstruction implements IAdd {

    public static final String MNEMONIC = "iadd";

    public static final IAdd INSTANCE = new DefaultIAdd();

    private DefaultIAdd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IADD;
    }
}
