package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FDiv;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFDiv extends AbstractInstruction implements FDiv {

    public static final String MNEMONIC = "fdiv";

    public static final FDiv INSTANCE = new DefaultFDiv();

    private DefaultFDiv() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FDIV;
    }
}
