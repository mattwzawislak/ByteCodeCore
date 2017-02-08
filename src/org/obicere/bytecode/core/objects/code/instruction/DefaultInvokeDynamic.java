package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.InvokeDynamic;
import org.javacore.common.BootstrapMethodLink;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultInvokeDynamic extends AbstractInstruction implements InvokeDynamic {

    public static final String MNEMONIC = "invokedynamic";

    private final BootstrapMethodLink invocation;

    private final int byte3;
    private final int byte4;

    public DefaultInvokeDynamic(final BootstrapMethodLink invocation) {
        this(invocation, 0, 0);
    }

    public DefaultInvokeDynamic(final BootstrapMethodLink invocation, final int byte3, final int byte4) {
        this.invocation = invocation;
        this.byte3 = byte3;
        this.byte4 = byte4;
    }

    @Override
    public BootstrapMethodLink getInvocation(){
        return invocation;
    }

    @Override
    public int getByte3() {
        return byte3;
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
        return InstructionReader.OPCODE_INVOKEDYNAMIC;
    }
}
