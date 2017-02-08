package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ElementValue;

/**
 * @author Obicere
 */
public abstract class AbstractElementValue implements ElementValue {

    private final int tag;

    public AbstractElementValue(final int tag) {
        this.tag = tag;
    }

    @Override
    public int getTag() {
        return tag;
    }
}
