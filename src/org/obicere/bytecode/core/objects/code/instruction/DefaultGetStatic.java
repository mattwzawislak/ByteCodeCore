package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.GetStatic;
import org.obicere.bytecode.core.objects.reference.FieldReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultGetStatic extends AbstractInstruction implements GetStatic {

    public static final String MNEMONIC = "getstatic";

    private final FieldReference reference;

    public DefaultGetStatic(final FieldReference reference) {
        this.reference = reference;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
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
        return InstructionReader.OPCODE_GETSTATIC;
    }
}
