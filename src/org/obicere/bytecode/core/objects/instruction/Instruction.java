package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.ByteCodeElement;

/**
 * @author Obicere
 */
public abstract class Instruction extends ByteCodeElement {

    public abstract String getMnemonic();

    public abstract byte getOpcode();

    @Override
    public String getIdentifier() {
        return getMnemonic();
    }

}
