package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.objects.reference.MethodReference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Obicere
 */
public class invokeinterface extends Instruction {

    public static final String IDENTIFIER = "invokeinterface";

    private final MethodReference reference;

    private final int byte4;

    public invokeinterface(final MethodReference reference) {
        this(reference, 0);
    }

    public invokeinterface(final MethodReference reference, final int byte4) {
        if (byte4 != 0) {
            Logger.getGlobal().log(Level.WARNING, "byte 4 of invokeinterface was not 0");
        }
        this.reference = reference;
        this.byte4 = byte4;
    }

    public MethodReference getReference() {
        return reference;
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
        return InstructionReader.OPCODE_INVOKEINTERFACE;
    }
}
