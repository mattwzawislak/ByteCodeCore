package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.PutStatic;
import org.javacore.reference.Reference;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultPutStatic extends AbstractInstruction implements PutStatic {

    public static final String MNEMONIC = "putstatic";

    private final Reference<JCField> reference;

    public DefaultPutStatic(final Reference<JCField> reference) {
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
        return Instructions.OPCODE_PUTSTATIC;
    }
}
