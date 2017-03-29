package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.BooleanElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultBooleanElementValue extends AbstractElementValue implements BooleanElementValue {

    private final boolean value;

    public DefaultBooleanElementValue(final boolean value) {
        super(ElementValues.TAG_BOOLEAN);
        this.value = value;
    }

    @Override
    public boolean getValue() {
        return value;
    }
}
