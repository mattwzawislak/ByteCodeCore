package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.Identifiable;

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
