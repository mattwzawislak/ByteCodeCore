package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.IInc;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultIInc extends AbstractInstruction implements IInc {

    public static final String MNEMONIC = "iinc";

    private final int index;
    private final int constant;

    public DefaultIInc(final int index, final int constant) {
        this.index = index;
        this.constant = constant;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int getConstant() {
        return constant;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_IINC;
    }
}
