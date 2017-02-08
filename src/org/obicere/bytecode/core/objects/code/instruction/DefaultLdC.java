package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LdC;
import org.javacore.constant.Constant;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLdC extends AbstractInstruction implements LdC {

    public static final String MNEMONIC = "ldc";

    private final Constant constant;

    public DefaultLdC(final Constant constant) {
        this.constant = constant;
    }

    @Override
    public Constant getConstant() {
        return constant;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LDC;
    }
}
