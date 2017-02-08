package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FAdd;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFAdd extends AbstractInstruction implements FAdd {

    public static final String MNEMONIC = "fadd";

    public static final FAdd INSTANCE = new DefaultFAdd();

    private DefaultFAdd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FADD;
    }
}
