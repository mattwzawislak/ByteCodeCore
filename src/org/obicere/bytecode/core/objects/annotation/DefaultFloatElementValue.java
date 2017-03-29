package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.FloatElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultFloatElementValue extends AbstractElementValue implements FloatElementValue {

    private final float value;

    public DefaultFloatElementValue(final float value) {
        super(ElementValues.TAG_FLOAT);
        this.value = value;
    }

    @Override
    public float getValue() {
        return value;
    }
}
