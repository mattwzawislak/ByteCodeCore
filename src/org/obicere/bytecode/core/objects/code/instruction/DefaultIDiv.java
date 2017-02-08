package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IDiv;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIDiv extends AbstractInstruction implements IDiv {

    public static final String MNEMONIC = "idiv";

    public static final IDiv INSTANCE = new DefaultIDiv();

    private DefaultIDiv() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IDIV;
    }
}
