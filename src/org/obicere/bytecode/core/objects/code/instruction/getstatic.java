package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class getstatic extends Instruction {

    public static final String IDENTIFIER = "getstatic";

    private final FieldReference reference;

    public getstatic(final FieldReference reference) {
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
        return InstructionReader.OPCODE_GETSTATIC;
    }
}
