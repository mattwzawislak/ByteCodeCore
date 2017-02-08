package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCMethod;
import org.javacore.code.instruction.InvokeInterface;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultInvokeInterface extends AbstractInstruction implements InvokeInterface {

    public static final String MNEMONIC = "invokeinterface";

    private final Reference<JCMethod> reference;

    private final int count;

    private final int byte4;

    public DefaultInvokeInterface(final Reference<JCMethod> reference, final int count) {
        this(reference, count, 0);
    }

    public DefaultInvokeInterface(final Reference<JCMethod> reference, final int count, final int byte4) {
        this.reference = reference;
        this.count = count;
        this.byte4 = byte4;
    }

    @Override
    public Reference<JCMethod> getMethod() {
        return reference;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int getByte4() {
        return byte4;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_INVOKEINTERFACE;
    }
}
