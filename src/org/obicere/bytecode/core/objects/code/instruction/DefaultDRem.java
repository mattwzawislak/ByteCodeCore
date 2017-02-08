package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.DRem;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDRem extends AbstractInstruction implements DRem {

    public static final String MNEMONIC = "drem";

    public static final DRem INSTANCE = new DefaultDRem();

    private DefaultDRem() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DREM;
    }

}
