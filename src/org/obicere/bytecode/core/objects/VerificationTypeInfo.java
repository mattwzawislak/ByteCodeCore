package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class VerificationTypeInfo implements Identifiable {

    private final int tag;

    public VerificationTypeInfo(final int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }
}
