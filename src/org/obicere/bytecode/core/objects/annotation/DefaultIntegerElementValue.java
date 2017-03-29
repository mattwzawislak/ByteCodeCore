package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.IntegerElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultIntegerElementValue extends AbstractElementValue implements IntegerElementValue {

    private final int value;

    public DefaultIntegerElementValue(final int value) {
        super(ElementValues.TAG_INTEGER);
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
