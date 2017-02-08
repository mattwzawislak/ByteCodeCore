package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.FloatElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultFloatElementValue extends AbstractElementValue implements FloatElementValue {

    private final float value;

    public DefaultFloatElementValue(final float value) {
        super(ElementValueReader.TAG_FLOAT);
        this.value = value;
    }

    @Override
    public float getValue() {
        return value;
    }
}
