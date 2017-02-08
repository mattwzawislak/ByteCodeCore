package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DDiv;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDDiv extends AbstractInstruction implements DDiv {

    public static final String MNEMONIC = "ddiv";

    public static final DDiv INSTANCE = new DefaultDDiv();

    private DefaultDDiv() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DDIV;
    }
}
