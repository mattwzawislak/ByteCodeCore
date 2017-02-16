package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeSpecial;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultInvokeSpecial extends AbstractInstruction implements InvokeSpecial {

    public static final String MNEMONIC = "invokespecial";

    private final Reference<JCMethod> reference;

    public DefaultInvokeSpecial(final Reference<JCMethod> reference) {
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
        return InstructionReader.OPCODE_INVOKESPECIAL;
    }
}
