package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.New;
import org.javacore.type.Type;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultNew extends AbstractInstruction implements New {

    public static final String MNEMONIC = "new";

    private final Type type;

    public DefaultNew(final Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_NEW;
    }

}
