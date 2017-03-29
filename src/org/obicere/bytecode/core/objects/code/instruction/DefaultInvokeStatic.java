package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeStatic;
import org.javacore.reference.Reference;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultInvokeStatic extends AbstractInstruction implements InvokeStatic {

    public static final String MNEMONIC = "invokestatic";

    private final Reference<JCMethod> reference;

    public DefaultInvokeStatic(final Reference<JCMethod> reference) {
        this.reference = reference;
    }

    @Override
    public int getLength(final int pc) {
        return 3;
    }

    @Override
    public Reference<JCMethod> getMethod() {
        return reference;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_INVOKESTATIC;
    }
}
