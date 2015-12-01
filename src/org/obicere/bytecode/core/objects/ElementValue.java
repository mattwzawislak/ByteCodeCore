package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public abstract class ElementValue extends ByteCodeElement {

    private final int tag;

    public ElementValue(final int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

}
