package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IAnd;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIAnd extends AbstractInstruction implements IAnd {

    public static final String MNEMONIC = "iand";

    public static final IAnd INSTANCE = new DefaultIAnd();

    private DefaultIAnd() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IAND;
    }
}
