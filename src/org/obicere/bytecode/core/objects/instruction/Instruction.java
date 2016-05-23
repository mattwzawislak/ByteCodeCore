package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.Identifiable;

/**
 * @author Obicere
 */
public abstract class Instruction implements Identifiable {

    public abstract String getMnemonic();

    public abstract byte getOpcode();

    @Override
    public String getIdentifier() {
        return getMnemonic();
    }

}
