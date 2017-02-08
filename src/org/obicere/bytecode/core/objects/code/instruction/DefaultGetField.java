package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.GetField;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultGetField extends AbstractInstruction implements GetField {

    public static final String MNEMONIC = "getfield";

    private final FieldReference reference;

    public DefaultGetField(final FieldReference reference) {
        this.reference = reference;
    }

    @Override
    public FieldReference getField() {
        return reference;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_GETFIELD;
    }
}
