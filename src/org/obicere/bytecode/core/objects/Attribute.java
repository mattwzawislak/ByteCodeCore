package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class Attribute implements Identifiable {

    private final int length;

    public Attribute(final int length) {
        this.length = length;
    }

    public final int getLength() {
        return length;
    }
}
