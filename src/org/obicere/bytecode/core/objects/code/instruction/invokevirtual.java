package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class invokevirtual extends Instruction {

    public static final String IDENTIFIER = "invokevirtual";

    private final MethodReference reference;

    public invokevirtual(final MethodReference reference) {
        this.reference = reference;
    }

    public MethodReference getReference() {
        return reference;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_INVOKEVIRTUAL;
    }
}
