package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class ElementValue implements Identifiable {

    private final int tag;

    public ElementValue(final int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

}
