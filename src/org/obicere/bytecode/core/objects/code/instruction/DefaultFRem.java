package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.FRem;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultFRem extends AbstractInstruction implements FRem {

    public static final String MNEMONIC = "frem";

    public static final FRem INSTANCE = new DefaultFRem();

    private DefaultFRem() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_FREM;
    }
}
