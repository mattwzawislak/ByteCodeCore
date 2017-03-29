package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.GetField;
import org.javacore.reference.Reference;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultGetField extends AbstractInstruction implements GetField {

    public static final String MNEMONIC = "getfield";

    private final Reference<JCField> reference;

    public DefaultGetField(final Reference<JCField> reference) {
        this.reference = reference;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Reference<JCField> getField() {
        return reference;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_GETFIELD;
    }
}
