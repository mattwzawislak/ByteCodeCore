package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.ALoad;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultALoad extends AbstractInstruction implements ALoad  {

    public static final  String MNEMONIC = "aload";

    private final int index;

    public DefaultALoad(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_ALOAD;
    }
}
