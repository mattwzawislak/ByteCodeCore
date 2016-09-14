package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class getfield extends Instruction {

    public static final String IDENTIFIER = "getfield";

    private final FieldReference reference;

    public getfield(final FieldReference reference) {
        this.reference = reference;
    }

    public FieldReference getReference() {
        return reference;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_GETFIELD;
    }
}
