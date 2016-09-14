package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Obicere
 */
public class invokedynamic extends Instruction {

    public static final String IDENTIFIER = "invokedynamic";

    private final BootstrapMethod method;
    private final MethodReference actualMethod;

    private final int byte3;
    private final int byte4;

    public invokedynamic(final BootstrapMethod method, final MethodReference actualMethod) {
        this(method, actualMethod, 0, 0);
    }

    public invokedynamic(final BootstrapMethod method, final MethodReference actualMethod, final int byte3, final int byte4) {
        if (byte3 != 0) {
            Logger.getGlobal().log(Level.WARNING, "byte 3 of invokedynamic was not 0");
        }
        if (byte4 != 0) {
            Logger.getGlobal().log(Level.WARNING, "byte 4 of invokedynamic was not 0");
        }
        this.method = method;
        this.actualMethod = actualMethod;
        this.byte3 = byte3;
        this.byte4 = byte4;
    }

    public BootstrapMethod getMethod() {
        return method;
    }

    public MethodReference getActualMethod() {
        return actualMethod;
    }

    public int getByte3() {
        return byte3;
    }

    public int getByte4() {
        return byte4;
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_INVOKEDYNAMIC;
    }
}
