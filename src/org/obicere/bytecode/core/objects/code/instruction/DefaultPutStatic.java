package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.JCField;
import org.javacore.code.instruction.PutStatic;
import org.javacore.reference.Reference;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

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
    public Reference<JCField> getField() {
        return reference;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_PUTSTATIC;
    }
}
