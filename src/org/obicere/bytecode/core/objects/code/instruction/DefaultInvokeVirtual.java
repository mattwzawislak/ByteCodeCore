package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeVirtual;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultInvokeVirtual extends AbstractInstruction implements InvokeVirtual {

    public static final String MNEMONIC = "invokevirtual";

    private final Reference<JCMethod> reference;

    public DefaultInvokeVirtual(final Reference<JCMethod> reference) {
        this.reference = reference;
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
        return InstructionReader.OPCODE_INVOKEVIRTUAL;
    }
}
