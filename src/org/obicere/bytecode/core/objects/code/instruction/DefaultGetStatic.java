package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.GetStatic;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultGetStatic extends AbstractInstruction implements GetStatic {

    public static final String MNEMONIC = "getstatic";

    private final Reference<JCField> reference;

    public DefaultGetStatic(final Reference<JCField> reference) {
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
        return InstructionReader.OPCODE_GETSTATIC;
    }
}
